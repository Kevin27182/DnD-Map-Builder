package mapbuilder.floors;

import mapbuilder.helpers.FloorButton;
import mapbuilder.templates.ToolbarButton;
import javax.swing.*;

public class MetalTileFloorButton extends ToolbarButton implements FloorButton {

    public MetalTileFloorButton() {
        super();
        setIcon(new ImageIcon("icons/metal_tile_floor.jpeg"));
        setToolTipText("Metal Tile Floor");
        renderIcon();
    }
}
