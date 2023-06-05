package com.dozenlee.gui.action;

import com.dozenlee.gui.GameMainWindow;

import javax.swing.*;

/**
 * @author Dozen Lee<br/>
 * 2023/6/6 1:48
 */
public class GameMainAction {

    private GameMainAction() {}

    public static void gameMainAction() {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ignored) {}

            GameMainWindow gameMainWindow = new GameMainWindow();
            gameMainWindow.init();
            gameMainWindow.setVisible(true);
        });
    }
}
