package mapbuilder.gui;

import mapbuilder.templates.Entity;
import javax.swing.*;
import java.awt.*;

public class TilePanel extends JPanel {

    private Entity entity;
    private ImageIcon icon;
    private ImageIcon floor;
    private final JLabel label = new JLabel();
    private final JLabel floorLabel = new JLabel();
    private int index;

    TilePanel() {
        setBackground(Theme.DARK_BACKGROUND_1);
        setBorder(BorderFactory.createLineBorder(Theme.DARK_BACKGROUND_0));
        FlowLayout layout = new FlowLayout();
        layout.setHgap(0);
        layout.setVgap(0);
        setLayout(layout);
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return this.index;
    }

    public ImageIcon getFloor() {
        return this.floor;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
        label.setIcon(icon);
        add(label);
    }

    public void setFloor(ImageIcon floor) {
        this.floor = floor;
        floorLabel.setIcon(floor);
        add(floorLabel);
    }

    public void clearIcon() {
        if (icon != null)
            remove(label);
        else if (floor != null)
            remove(floorLabel);
    }

    public void clearAllIcons() {
        remove(label);
        remove(floorLabel);
    }
}
