package mapbuilder.gui;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    // Construct a new window
    public Window() {
        setTitle("New Window");
        setPreferredSize(new Dimension(Theme.WINDOW_WIDTH, Theme.WINDOW_HEIGHT));
        setMinimumSize(new Dimension(Theme.WINDOW_WIDTH, Theme.WINDOW_HEIGHT));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    // Construct a new window with a customized title
    public Window(String name) {
        this();
        setTitle(name);
    }

    public void revalidateEverything() {
        repaint();
        revalidate();
    }

    public static void main(String[] args) {
        Window window = new Window("Dungeons and Dragons Map Builder");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.add(new Canvas());

        window.pack();
        window.setVisible(true);
    }
}