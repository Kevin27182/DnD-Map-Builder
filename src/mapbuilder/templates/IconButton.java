package mapbuilder.templates;

import javax.swing.*;
import java.awt.*;

public abstract class IconButton extends JButton {

    private ImageIcon origIcon;
    private ImageIcon scaledIcon;

    public void setIcon(ImageIcon icon) {
        this.origIcon = icon;
        this.scaledIcon = icon;
    }

    public ImageIcon getOrigIcon() {
        return this.origIcon;
    }

    public void renderIcon() {
        add(new JLabel(scaledIcon));
    }

    public void scaleIcon(int width, int height) {
        Image scaledImage = origIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        this.scaledIcon = new ImageIcon(scaledImage);
    }
}
