package mapbuilder.items;

import mapbuilder.templates.ToolbarButton;
import javax.swing.*;

public class ChestButton extends ToolbarButton {

    public ChestButton() {
        super();
        setIcon(new ImageIcon("icons/chest_light.png"));
        setToolTipText("Chest");
        renderIcon();
    }
}
