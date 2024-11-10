package mapbuilder.gui;

import javax.swing.*;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class ToolbarPanel extends JPanel {

    private ArrayList<ToolbarButton> floors;
    private ArrayList<ToolbarButton> structures;
    private ArrayList<ToolbarButton> items;
    private ArrayList<ToolbarButton> creatures;

    public ToolbarPanel() {
        setBackground(Theme.DARK_BACKGROUND_2);
        IntStream.range(0,20).forEach(_ -> add(new ToolbarButton()));
    }
}
