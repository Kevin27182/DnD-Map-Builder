package mapbuilder.gui;

import javax.swing.*;
import java.awt.event.*;

public abstract class IconButton extends JButton implements MouseListener {

    @Override
    public void mousePressed(MouseEvent e) {
        // Not needed in subclasses
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Not needed in subclasses
    }
}
