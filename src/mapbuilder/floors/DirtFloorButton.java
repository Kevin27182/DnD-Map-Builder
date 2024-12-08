package mapbuilder.floors;

import mapbuilder.helpers.FloorButton;
import mapbuilder.templates.ToolbarButton;
import javax.swing.*;

public class DirtFloorButton extends ToolbarButton implements FloorButton {

    public DirtFloorButton() {
        super();
        setIcon(new ImageIcon("icons/dirt_floor.jpeg"));
        setToolTipText("Dirt Floor");
        renderIcon();
    }
}
