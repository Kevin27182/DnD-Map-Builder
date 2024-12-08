package mapbuilder.items;

import mapbuilder.templates.ToolbarButton;
import javax.swing.*;

public class GoldButton extends ToolbarButton {

    public GoldButton() {
        super();
        setIcon(new ImageIcon("icons/gold_light.png"));
        setToolTipText("Gold");
        renderIcon();
    }
}
