package mapbuilder.gui;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {

    public Canvas() {

        ToolbarPanel toolbarPanel = new ToolbarPanel();

        setBackground(Theme.DARK_BACKGROUND_1);
        setLayout(new BorderLayout());

        add(toolbarPanel, BorderLayout.NORTH);
        add(new GridPanel(), BorderLayout.CENTER);
    }
}
