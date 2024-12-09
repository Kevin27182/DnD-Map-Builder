package mapbuilder.structures;

import mapbuilder.templates.ToolbarButton;
import javax.swing.*;

public class StairsDownButton extends ToolbarButton {

    public StairsDownButton() {
        super();
        setIcon(new ImageIcon("icons/stairs-down-light.png"));
        setToolTipText("Stairs Down");
        renderIcon();
    }
}
