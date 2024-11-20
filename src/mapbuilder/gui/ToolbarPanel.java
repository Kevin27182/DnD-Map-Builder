package mapbuilder.gui;

import mapbuilder.helpers.GridPanelListener;
import mapbuilder.helpers.ToolbarButtonListener;
import mapbuilder.helpers.ToolbarListener;
import mapbuilder.items.SwordButton;
import mapbuilder.templates.ToolbarButton;
import mapbuilder.tools.TrashButton;
import javax.swing.*;
import java.util.ArrayList;

public class ToolbarPanel extends JPanel implements ToolbarButtonListener, GridPanelListener {

    private ArrayList<ToolbarButton> floors = new ArrayList<>();
    private ArrayList<ToolbarButton> structures = new ArrayList<>();
    private ArrayList<ToolbarButton> items = new ArrayList<>();
    private ArrayList<ToolbarButton> creatures = new ArrayList<>();
    private ArrayList<ToolbarButton> tools = new ArrayList<>();
    private ArrayList<ToolbarListener> listeners = new ArrayList<>();
    private ToolbarButton currentButton;
    private boolean selectionActive = false;

    public ToolbarPanel() {
        setBackground(Theme.DARK_BACKGROUND_2);
        addButton(items, new SwordButton());
        addButton(tools, new TrashButton());
        renderButtons();
    }

    public void renderButtons() {
        floors.forEach(this::add);
        structures.forEach(this::add);
        items.forEach(this::add);
        creatures.forEach(this::add);
        add(new ToolbarSeparator());
        tools.forEach(this::add);
    }

    public void addButton(ArrayList<ToolbarButton> list, ToolbarButton item) {
        item.addToolbarButtonListener(this);
        list.add(item);
    }

    public void addToolbarListener(ToolbarListener listener) {
        listeners.add(listener);
    }

    @Override
    public void activateListeners() {
        listeners.forEach(ToolbarListener::activateSelection);
    }

    @Override
    public void deactivateListeners() {
        listeners.forEach(ToolbarListener::deactivateSelection);
    }

    @Override
    public void setCurrentButton(ToolbarButton button) {
        this.currentButton = button;
    }

    @Override
    public ToolbarButton getCurrentButton() {
        return this.currentButton;
    }

    @Override
    public boolean getSelectionActive() {
        return selectionActive;
    }

    @Override
    public void setSelectionActive(boolean selectionActive) {
        this.selectionActive = selectionActive;
    }

    @Override
    public ImageIcon getActiveIcon() {
        ImageIcon icon = currentButton.getOrigIcon();
        if (icon == null)
            return null;
        return new ImageIcon(icon.getImage());
    }
}
