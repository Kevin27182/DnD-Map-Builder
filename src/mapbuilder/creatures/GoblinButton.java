package mapbuilder.creatures;

import mapbuilder.templates.ToolbarButton;
import javax.swing.*;

public class GoblinButton extends ToolbarButton {

    public GoblinButton() {
        super();
        setIcon(new ImageIcon("icons/goblin_light.png"));
        setToolTipText("Goblin");
        renderIcon();
    }
}
