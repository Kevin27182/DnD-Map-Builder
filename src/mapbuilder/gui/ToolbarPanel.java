package mapbuilder.gui;

import mapbuilder.items.EmptyButton;
import mapbuilder.items.SwordButton;
import mapbuilder.templates.ToolbarButton;

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
        add(new SwordButton());
        IntStream.range(0,19).forEach(_ -> add(new EmptyButton()));
    }

    public void addItem(ToolbarButton item) {
        items.add(item);
    }

    public void addStructure(ToolbarButton structure) {
        structures.add(structure);
    }

    public void addCreature(ToolbarButton creature) {
        creatures.add(creature);
    }
}
