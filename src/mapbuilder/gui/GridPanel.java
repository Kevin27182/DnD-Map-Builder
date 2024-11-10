package mapbuilder.gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class GridPanel extends JPanel {

    public ArrayList<TilePanel> tiles;

    public GridPanel() {
        setBackground(Theme.DARK_BACKGROUND_0);
        setLayout(new GridLayout(Theme.GRID_HEIGHT, Theme.GRID_WIDTH));

        // Construct tiles array
        final int numTiles = Theme.GRID_HEIGHT * Theme.GRID_WIDTH;
        IntStream.range(0, numTiles).forEach(_ -> add(new TilePanel()));

        // Add padding around grid
        setBorder(new EmptyBorder(Theme.DEFAULT_INSETS));
    }
}
