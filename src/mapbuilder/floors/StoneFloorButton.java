package mapbuilder.floors;

import mapbuilder.templates.ToolbarButton;
import javax.swing.*;

public class StoneFloorButton extends ToolbarButton {

    public StoneFloorButton() {
        super();
        setIcon(new ImageIcon("icons/stone_floor.png"));
        setToolTipText("Stone Floor");
        renderIcon();
    }
}
