package mapbuilder.structures;

import mapbuilder.templates.ToolbarButton;
import javax.swing.*;

public class SpikeTrapButton extends ToolbarButton {

    public SpikeTrapButton() {
        super();
        setIcon(new ImageIcon("icons/spike_trap_light.png"));
        setToolTipText("Spike Trap");
        renderIcon();
    }
}
