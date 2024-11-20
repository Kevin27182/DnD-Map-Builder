package mapbuilder.gui;

import javax.swing.*;
import java.awt.*;

public class ToolbarButtonOverlay extends JPanel {

    public ToolbarButtonOverlay() {
        setPreferredSize(new Dimension(Theme.TOOLBAR_BUTTON_WIDTH, Theme.TOOLBAR_BUTTON_HEIGHT));
        setBackground(new Color(0x80FFFFFF, true));
    }
}
