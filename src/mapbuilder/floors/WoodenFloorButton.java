package mapbuilder.floors;

import mapbuilder.helpers.FloorButton;
import mapbuilder.templates.ToolbarButton;
import javax.swing.*;

public class WoodenFloorButton extends ToolbarButton implements FloorButton {

    public WoodenFloorButton() {
        super();
        setIcon(new ImageIcon("icons/wooden_floor.jpeg"));
        setToolTipText("Wooden Floor");
        renderIcon();
    }
}
