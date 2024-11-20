package mapbuilder.gui;

import mapbuilder.templates.Entity;

import javax.swing.*;

public class TilePanel extends JPanel {

    private Entity entity;

    TilePanel() {
        setBackground(Theme.DARK_BACKGROUND_1);
        setBorder(BorderFactory.createLineBorder(Theme.DARK_BACKGROUND_0));
    }
}
