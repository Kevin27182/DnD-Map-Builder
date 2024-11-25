package mapbuilder.gui;

import mapbuilder.helpers.GridPanelListener;
import mapbuilder.helpers.ToolbarListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
            tile.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    tile.setBackground(Color.red);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    tile.setBackground(Theme.DARK_BACKGROUND_1);
                }

                @Override
                public void mousePressed(MouseEvent e) {

                    // Get the current active element's icon
                    ImageIcon activeIcon = listener.getActiveIcon();
                    tile.clearIcon();

                    // If the icon is not null, scale the icon and set it
                    if (activeIcon != null) {
                        Image scaledImage = activeIcon.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
                        activeIcon.setImage(scaledImage);

                        // Check if icon is a floor or entity icon.
                        if (tile.getFloor() == null) {
                            tile.setFloor(activeIcon);
                        }
                        else{
                            tile.setIcon(activeIcon);
                        }
                    }

                    // Update tile graphics
                    tile.repaint();
                    tile.revalidate();
                }
            });
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
