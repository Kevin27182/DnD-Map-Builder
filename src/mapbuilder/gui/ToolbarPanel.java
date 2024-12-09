package mapbuilder.gui;

import mapbuilder.creatures.DemonButton;
import mapbuilder.creatures.GhostButton;
import mapbuilder.creatures.GoblinButton;
import mapbuilder.creatures.MonsterButton;
import mapbuilder.floors.*;
import mapbuilder.helpers.FloorButton;
import mapbuilder.helpers.GridPanelListener;
import mapbuilder.helpers.ToolbarButtonListener;
import mapbuilder.helpers.ToolbarListener;
import mapbuilder.items.*;
import mapbuilder.structures.*;
import mapbuilder.templates.ToolbarButton;
import mapbuilder.tools.TrashButton;
import javax.swing.*;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class ToolbarPanel extends JPanel implements ToolbarButtonListener, GridPanelListener {

    private final ArrayList<ToolbarButton> floors = new ArrayList<>();
    private final ArrayList<ToolbarButton> structures = new ArrayList<>();
    private final ArrayList<ToolbarButton> items = new ArrayList<>();
    private final ArrayList<ToolbarButton> creatures = new ArrayList<>();
    private final ArrayList<ToolbarButton> tools = new ArrayList<>();
    private final ArrayList<ArrayList<ToolbarButton>> bins = new ArrayList<>() {{add(floors); add(structures); add(items); add(creatures); add(tools);}};
    private final ArrayList<ToolbarListener> listeners = new ArrayList<>();
    private ToolbarButton currentButton;
    private boolean selectionActive = false;

    public ToolbarPanel() {
        setBackground(Theme.DARK_BACKGROUND_2);

        // Floors
        addButton(floors, new StoneFloorButton());
        addButton(floors, new CanyonFloorButton());
        addButton(floors, new StoneBricksFloorButton());
        addButton(floors, new WoodenFloorButton());
        addButton(floors, new DirtFloorButton());
        addButton(floors, new MetalTileFloorButton());
        addButton(floors, new WaterFloorButton());
        addButton(floors, new LavaFloorButton());
        addButton(tools, new TrashButton());

        // Structures
        addButton(structures, new StairsUpButton());
        addButton(structures, new StairsDownButton());
        addButton(structures, new StatueButton());
        addButton(structures, new SpikeTrapButton());
        addButton(structures, new TripwireButton());
        addButton(structures, new HazardButton());

        // Items
        addButton(items, new SwordButton());
        addButton(items, new MagicItemButton());
        addButton(items, new PotionButton());
        addButton(items, new ChestButton());
        addButton(items, new GoldButton());
        addButton(items, new KeyButton());

        // Creatures
        addButton(creatures, new MonsterButton());
        addButton(creatures, new GoblinButton());
        addButton(creatures, new GhostButton());
        addButton(creatures, new DemonButton());

        renderButtons();
    }

    public void renderButtons() {
        AtomicInteger counter = new AtomicInteger(0);
        bins.forEach(bin -> {
            bin.forEach(this::add);
            if (counter.getAndIncrement() < bins.size()-1 & !bin.isEmpty())
                add(new ToolbarSeparator());
        });
    }

    public void addButton(ArrayList<ToolbarButton> list, ToolbarButton item) {
        item.addToolbarButtonListener(this);
        list.add(item);
    }

    public void addToolbarListener(ToolbarListener listener) {
        listeners.add(listener);
    }

    @Override
    public boolean isTrashSelected() {
        return currentButton instanceof TrashButton;
    }

    @Override
    public boolean isFloorSelected() {
        return currentButton instanceof FloorButton;
    }

    @Override
    public void disableOverlays() {
        bins.forEach(bin -> bin.forEach(ToolbarButton::disableOverlay));
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
