package mapbuilder.gui;

import mapbuilder.helpers.GridPanelListener;
import mapbuilder.helpers.GridPanelMouseAdapter;
import mapbuilder.helpers.ToolbarListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class GridPanel extends JPanel implements ToolbarListener {

    public ArrayList<TilePanel> tiles = new ArrayList<>();
    private GridPanelListener listener;

    public GridPanel() {
        setBackground(Theme.DARK_BACKGROUND_0);
        setLayout(new GridLayout(Theme.GRID_HEIGHT, Theme.GRID_WIDTH));

        // Construct tiles array
        final int numTiles = Theme.GRID_HEIGHT * Theme.GRID_WIDTH;
        AtomicInteger counter = new AtomicInteger(0);
        IntStream.range(0, numTiles).forEach(_ -> {
            TilePanel tilePanel = new TilePanel();
            tilePanel.setIndex(counter.getAndIncrement());
            tiles.add(tilePanel);
            add(tilePanel);
        });

        // Add padding around grid
        setBorder(new EmptyBorder(Theme.DEFAULT_INSETS));
    }

    @Override
    public void activateSelection() {
        for (TilePanel tile : tiles) {
            tile.addMouseListener(new GridPanelMouseAdapter(tile, listener));
        }
    }

    @Override
    public void deactivateSelection() {
        for (TilePanel tile : tiles) {
            Arrays.stream(tile.getMouseListeners()).forEach(tile::removeMouseListener);
        }
    }

    public void addGridPanelListener(GridPanelListener listener) {
        this.listener = listener;
    }
}
