package mapbuilder.gui;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {

    public Canvas() {

        ToolbarPanel toolbarPanel = new ToolbarPanel();
        GridPanel gridPanel = new GridPanel();

        setBackground(Theme.DARK_BACKGROUND_1);
        setLayout(new BorderLayout());

        add(toolbarPanel, BorderLayout.NORTH);
        add(gridPanel, BorderLayout.CENTER);

        toolbarPanel.addToolbarListener(gridPanel);
        gridPanel.addGridPanelListener(toolbarPanel);
    }
}
