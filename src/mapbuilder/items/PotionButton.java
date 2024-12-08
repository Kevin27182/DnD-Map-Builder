package mapbuilder.items;

import mapbuilder.templates.ToolbarButton;
import javax.swing.*;

public class PotionButton extends ToolbarButton {

    public PotionButton() {
        super();
        setIcon(new ImageIcon("icons/potion_light.png"));
        setToolTipText("Potion");
        renderIcon();
    }
}
