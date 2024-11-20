package mapbuilder.helpers;

import mapbuilder.templates.ToolbarButton;

public interface ToolbarButtonListener {
    void activateListeners();
    void deactivateListeners();
    void setCurrentButton(ToolbarButton button);
    ToolbarButton getCurrentButton();
    boolean getSelectionActive();
    void setSelectionActive(boolean selectionActive);
    void disableOverlays();
}
