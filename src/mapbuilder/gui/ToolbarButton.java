package mapbuilder.gui;

import java.awt.*;
import java.awt.event.MouseEvent;

public class ToolbarButton extends IconButton {

    public ToolbarButton() {
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
