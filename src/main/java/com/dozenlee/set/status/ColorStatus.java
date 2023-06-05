package com.dozenlee.set.status;

/**
 * @author Dozen Lee<br/>
 * 2023/5/14 3:54
 */
public enum ColorStatus {

    /**
     * Default Value
     */
    NONE("none", null),

    /**
     * Green
     */
    GREEN("green", -1),

    /**
     * Red
     */
    RED("red", 0),

    /**
     * Purple
     */
    PURPLE("purple", 1);

    ColorStatus(String color, Integer val) {
        this.str = color;
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    @Override
    public String toString() {
        return str;
    }

    private final String str;
    private final int val;
}
