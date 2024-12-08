package mapbuilder.floors;

import mapbuilder.helpers.FloorButton;
import mapbuilder.templates.ToolbarButton;
import javax.swing.*;

public class StoneBricksFloorButton extends ToolbarButton implements FloorButton {

    public StoneBricksFloorButton() {
        super();
        setIcon(new ImageIcon("icons/stone_bricks_floor.jpeg"));
        setToolTipText("Stone Bricks Floor");
        renderIcon();
    }
}
