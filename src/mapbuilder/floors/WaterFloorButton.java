package mapbuilder.floors;

import mapbuilder.helpers.FloorButton;
import mapbuilder.templates.ToolbarButton;
import javax.swing.*;

public class WaterFloorButton extends ToolbarButton implements FloorButton {

    public WaterFloorButton() {
        super();
        setIcon(new ImageIcon("icons/water_floor.jpeg"));
        setToolTipText("Water Floor");
        renderIcon();
    }
}
