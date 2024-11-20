package mapbuilder.templates;

import mapbuilder.gui.Theme;
import mapbuilder.gui.ToolbarButtonOverlay;
import mapbuilder.helpers.ToolbarButtonListener;
import javax.swing.*;
import java.awt.*;

public abstract class ToolbarButton extends IconButton {

    private ToolbarButtonListener listener;
    private final ToolbarButtonOverlay overlay = new ToolbarButtonOverlay();

    public ToolbarButton() {
        setPreferredSize(new Dimension(Theme.TOOLBAR_BUTTON_WIDTH, Theme.TOOLBAR_BUTTON_HEIGHT));
        setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        setBackground(Theme.DARK_BACKGROUND_1);
        addActionListener(_ -> toggleListeners());
        setLayout(new OverlayLayout(this));
    }

    // Scales the incoming icon appropriately before setting
    @Override
    public void setIcon(ImageIcon icon) {
        super.setIcon(icon);
        super.scaleIcon(Theme.TOOLBAR_ICON_WIDTH, Theme.TOOLBAR_ICON_HEIGHT);
    }

    public void addToolbarButtonListener(ToolbarButtonListener listener) {
        this.listener = listener;
    }

    private void toggleListeners() {
        listener.disableOverlays();
        if (!listener.getSelectionActive() | listener.getCurrentButton() != this) {
            enableOverlay();
            listener.setCurrentButton(this);
            listener.activateListeners();
            listener.setSelectionActive(true);
        } else {
            listener.deactivateListeners();
            listener.setSelectionActive(false);
        }
    }

    public void enableOverlay() {
        add(overlay);
        repaint();
        revalidate();
    }

    public void disableOverlay() {
        remove(overlay);
    }
}
