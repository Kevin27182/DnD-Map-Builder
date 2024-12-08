package mapbuilder.items;

import mapbuilder.templates.ToolbarButton;
import javax.swing.*;

public class KeyButton extends ToolbarButton {

    public KeyButton() {
        super();
        setIcon(new ImageIcon("icons/key_light.png"));
        setToolTipText("Key");
        renderIcon();
    }
}
