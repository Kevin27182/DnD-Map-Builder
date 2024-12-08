package mapbuilder.structures;

import mapbuilder.templates.ToolbarButton;
import javax.swing.*;

public class HazardButton extends ToolbarButton {

    public HazardButton() {
        super();
        setIcon(new ImageIcon("icons/hazard_light.png"));
        setToolTipText("Hazard");
        renderIcon();
    }
}
