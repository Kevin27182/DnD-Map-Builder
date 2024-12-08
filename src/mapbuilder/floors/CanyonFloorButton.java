package mapbuilder.floors;

import mapbuilder.helpers.FloorButton;
import mapbuilder.templates.ToolbarButton;
import javax.swing.*;

public class CanyonFloorButton extends ToolbarButton implements FloorButton {

    public CanyonFloorButton () {
        super();
        setIcon(new ImageIcon("icons/canyon_floor.jpeg"));
        setToolTipText("Canyon Floor");
        renderIcon();
    }
}
