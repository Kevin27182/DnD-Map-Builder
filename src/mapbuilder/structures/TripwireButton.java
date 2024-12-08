package mapbuilder.structures;

import mapbuilder.templates.ToolbarButton;
import javax.swing.*;

public class TripwireButton extends ToolbarButton {

    public TripwireButton() {
        super();
        setIcon(new ImageIcon("icons/tripwire_light.png"));
        setToolTipText("Tripwire");
        renderIcon();
    }
}
