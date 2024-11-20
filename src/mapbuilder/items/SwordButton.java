package mapbuilder.items;

import mapbuilder.templates.ToolbarButton;
import javax.swing.*;

public class SwordButton extends ToolbarButton {

    public SwordButton() {
        super();
        setIcon(new ImageIcon("icons/gladius_light.png"));
        setToolTipText("Sword");
        renderIcon();
    }
}
