package mapbuilder.templates;

import mapbuilder.gui.Theme;

import java.awt.*;
import java.awt.event.MouseEvent;

public abstract class Entity extends IconButton {

    public Entity() {
        // Button press response
        addActionListener(event -> {

        });

        setPreferredSize(new Dimension(Theme.TOOLBAR_BUTTON_WIDTH, Theme.TOOLBAR_BUTTON_HEIGHT));
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
}
