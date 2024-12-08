package mapbuilder.creatures;

import mapbuilder.templates.ToolbarButton;
import javax.swing.*;

public class GhostButton extends ToolbarButton {

    public GhostButton() {
        super();
        setIcon(new ImageIcon("icons/ghost_light.png"));
        setToolTipText("Ghost");
        renderIcon();
    }
}
