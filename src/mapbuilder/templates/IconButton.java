package mapbuilder.templates;

import javax.swing.*;
import java.awt.event.*;

public abstract class IconButton extends JButton implements MouseListener {

    private ImageIcon icon;

    @Override
    public void mousePressed(MouseEvent e) {
        // Not needed in subclasses
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Not needed in subclasses
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    public void renderIcon() {
        add(new JLabel(icon));
    }
}
