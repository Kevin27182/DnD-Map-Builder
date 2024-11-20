package mapbuilder.helpers;

import mapbuilder.templates.ToolbarButton;

public interface ToolbarButtonListener {
    void activateListeners();
    void deactivateListeners();
    void setCurrentButton(ToolbarButton button);
    boolean getSelectionActive();
    void setSelectionActive(boolean selectionActive);
}
