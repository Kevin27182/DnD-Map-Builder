package mapbuilder.gui;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {

    public Canvas() {
        setBackground(Theme.DARK_BACKGROUND_1);
        setLayout(new BorderLayout());

        add(new ToolbarPanel(), BorderLayout.NORTH);
        add(new GridPanel(), BorderLayout.CENTER);
    }
}
