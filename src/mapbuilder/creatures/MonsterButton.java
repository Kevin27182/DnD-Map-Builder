package mapbuilder.creatures;

import mapbuilder.templates.ToolbarButton;
import javax.swing.*;

public class MonsterButton extends ToolbarButton {

    public MonsterButton() {
        super();
        setIcon(new ImageIcon("icons/monster_light.png"));
        setToolTipText("Monster");
        renderIcon();
    }
}
