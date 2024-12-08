package mapbuilder.structures;

import mapbuilder.templates.ToolbarButton;
import javax.swing.*;

public class StatueButton extends ToolbarButton {

    public StatueButton() {
        super();
        setIcon(new ImageIcon("icons/statue_light.png"));
        setToolTipText("Statue");
        renderIcon();
    }
}
