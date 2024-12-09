package mapbuilder.structures;

import mapbuilder.templates.ToolbarButton;
import javax.swing.*;

public class StairsUpButton extends ToolbarButton {

    public StairsUpButton() {
        super();
        setIcon(new ImageIcon("icons/stairs-up-light.png"));
        setToolTipText("Stairs Up");
        renderIcon();
    }
}
