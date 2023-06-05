package com.dozenlee;

import com.dozenlee.gui.action.GameMainAction;

/**
 * @author Dozen Lee<br/>
 * 2023/5/14 3:13
 */
public class MainActivity {

    public static void main(String[] args) {
        try {
            GameMainAction.gameMainAction();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
