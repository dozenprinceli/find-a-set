package com.dozenlee.gui.game;

import javax.swing.*;

/**
 * @author Dozen Lee<br/>
 * 2023/5/14 16:22
 */
public class GameWindow extends JPanel {

    public GameWindow() {

    }

    private enum GameStatus {
        /**
         * Default status
         */
        NONE,

        /**
         * Initialize end, ready to start
         */
        READY,

        /**
         * Game ongoing
         */
        ONGOING,

        /**
         * Game show result
         */
        RESULT,
    }

    private GameStatus curStatus = GameStatus.NONE;
}
