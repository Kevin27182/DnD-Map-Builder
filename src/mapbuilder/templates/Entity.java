package mapbuilder.templates;

import mapbuilder.gui.Theme;

import java.awt.*;

public abstract class Entity extends IconButton {

    public Entity() {
        // Button press response
        addActionListener(event -> {

        });

        setPreferredSize(new Dimension(Theme.TOOLBAR_BUTTON_WIDTH, Theme.TOOLBAR_BUTTON_HEIGHT));
    }
}
