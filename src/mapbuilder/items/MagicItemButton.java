package mapbuilder.items;

import mapbuilder.templates.ToolbarButton;
import javax.swing.*;

public class MagicItemButton extends ToolbarButton {

    public MagicItemButton() {
        super();
        setIcon(new ImageIcon("icons/magic_item_light.png"));
        setToolTipText("Magic Item");
        renderIcon();
    }
}
