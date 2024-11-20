package mapbuilder.gui;

import mapbuilder.templates.Entity;

import javax.swing.*;

public class TilePanel extends JPanel {

    private Entity entity;
    private ImageIcon icon;
    private JLabel label = new JLabel();
    private int index;

    TilePanel() {
        setBackground(Theme.DARK_BACKGROUND_1);
        setBorder(BorderFactory.createLineBorder(Theme.DARK_BACKGROUND_0));
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
        label.setIcon(icon);
        add(label);
    }

    public void clearIcon() {
        remove(label);
    }
}
