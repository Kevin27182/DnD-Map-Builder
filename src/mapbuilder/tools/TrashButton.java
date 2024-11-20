package mapbuilder.tools;

import mapbuilder.templates.ToolbarButton;

import javax.swing.*;

public class TrashButton extends ToolbarButton {

    public TrashButton() {
        super();
        setIcon(new ImageIcon("icons/trashcan_light.png"));
        setToolTipText("Trash");
        renderIcon();
    }

    @Override
    public ImageIcon getOrigIcon() {
        return null;
    }
}
