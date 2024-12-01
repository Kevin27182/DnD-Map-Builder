package mapbuilder.helpers;

import mapbuilder.gui.Theme;
import mapbuilder.gui.TilePanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GridPanelMouseAdapter extends MouseAdapter {

    private final TilePanel tile;
    private final GridPanelListener listener;

    public GridPanelMouseAdapter(TilePanel tile, GridPanelListener listener) {
        this.tile = tile;
        this.listener = listener;
    }

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

        tile.clearAllIcons();

        // If the icon is not null, scale the icon and set it
        if (!listener.isTrashSelected()) {

            // Get the current active element's icon
            ImageIcon activeIcon = listener.getActiveIcon();
            boolean isFloor = listener.isFloorSelected();
            int offset = isFloor ? 0 : -10;

            Image scaledImage = activeIcon.getImage().getScaledInstance(Theme.FLOOR_GRID_ICON_WIDTH + offset,Theme.FLOOR_GRID_ICON_HEIGHT + offset,Image.SCALE_SMOOTH);
            activeIcon.setImage(scaledImage);

            // Check if icon is a floor or entity icon.
            if (isFloor) {
                tile.setFloor(activeIcon);
            }
            else {
                tile.setIcon(activeIcon);
            }
        }

        // Update tile graphics
        tile.repaint();
        tile.revalidate();
    }
}
