package com.dozenlee.gui;

import com.dozenlee.gui.game.GameWindow;

import javax.swing.*;

/**
 * @author Dozen Lee<br/>
 * 2023/5/14 2:58
 */
public class GameMainWindow extends JFrame {

    public GameMainWindow() {
        // TODO
    }

    public void init() {
        // TODO
    }

    private enum Tab {
        /**
         * Game tab
         */
        GAME,

        /**
         * TODO next version
         * Record tab
         */
        RECORD,

        /**
         * TODO next version
         * Stats tab
         */
        STATS
    }

    private final JPanel gameWindow = new GameWindow();
}
