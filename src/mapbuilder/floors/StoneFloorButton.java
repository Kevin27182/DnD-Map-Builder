package mapbuilder.floors;

import mapbuilder.helpers.FloorButton;
import mapbuilder.templates.ToolbarButton;
import javax.swing.*;

public class StoneFloorButton extends ToolbarButton implements FloorButton {

    public StoneFloorButton() {
        super();
        setIcon(new ImageIcon("icons/stone_floor.jpeg"));
        setToolTipText("Stone Floor");
        renderIcon();
    }
}
