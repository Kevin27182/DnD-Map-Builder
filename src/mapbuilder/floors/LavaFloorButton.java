package mapbuilder.floors;

import mapbuilder.helpers.FloorButton;
import mapbuilder.templates.ToolbarButton;
import javax.swing.*;

public class LavaFloorButton extends ToolbarButton implements FloorButton {

    public LavaFloorButton() {
        super();
        setIcon(new ImageIcon("icons/lava_floor.jpeg"));
        setToolTipText("Lava Floor");
        renderIcon();
    }
}
