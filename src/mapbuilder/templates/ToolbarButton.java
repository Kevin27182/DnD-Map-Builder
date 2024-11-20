package mapbuilder.templates;

import mapbuilder.gui.Theme;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public abstract class ToolbarButton extends IconButton {

    public ToolbarButton() {
        setPreferredSize(new Dimension(Theme.TOOLBAR_BUTTON_WIDTH, Theme.TOOLBAR_BUTTON_HEIGHT));
        setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        setBackground(Theme.DARK_BACKGROUND_1);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    // Scales the incoming icon appropriately before setting
    @Override
    public void setIcon(ImageIcon icon) {
        Image scaledImage = icon.getImage().getScaledInstance(Theme.TOOLBAR_ICON_WIDTH, Theme.TOOLBAR_ICON_HEIGHT, Image.SCALE_SMOOTH);
        super.setIcon(new ImageIcon(scaledImage));
    }
}
