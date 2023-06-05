package com.dozenlee.set.status;

/**
 * @author Dozen Lee<br/>
 * 2023/5/14 3:54
 */
public enum ShapeStatus {

    /**
     * Default Value
     */
    NONE("none", null),

    /**
     * Oval
     */
    OVAL("oval", -1),

    /**
     * Diamond
     */
    DIAMOND("diamond", 0),

    /**
     * Wave
     */
    WAVE("wave", 1);

    ShapeStatus(String shape, Integer val) {
        this.str = shape;
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
