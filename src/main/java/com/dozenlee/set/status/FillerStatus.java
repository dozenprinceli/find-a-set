package com.dozenlee.set.status;

/**
 * @author Dozen Lee<br/>
 * 2023/5/14 3:55
 */
public enum FillerStatus {

    /**
     * Default Value
     */
    NONE("none", null),

    /**
     * Empty filler
     */
    EMPTY("empty", -1),

    /**
     * Stripped filler
     */
    STRIP("strip", 0),

    /**
     * Full filler
     */
    FULL("full", 1);

    FillerStatus(String str, Integer val) {
        this.str = str;
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
