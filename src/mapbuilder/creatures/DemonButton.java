package mapbuilder.creatures;

import mapbuilder.templates.ToolbarButton;
import javax.swing.*;

public class DemonButton extends ToolbarButton {

    public DemonButton() {
        super();
        setIcon(new ImageIcon("icons/demon_light.png"));
        setToolTipText("Demon");
        renderIcon();
    }
}
