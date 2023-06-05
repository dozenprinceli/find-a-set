package com.dozenlee.set.status;

/**
 * @author Dozen Lee<br/>
 * 2023/5/14 3:55
 */
public enum CountStatus {

    /**
     * Default Value
     */
    NONE(0, null),

    /**
     * Single figure
     */
    SINGLE(1, -1),

    /**
     * Double figure
     */
    DOUBLE(2, 0),

    /**
     * Triple figure
     */
    TRIPLE(3, 1);

    CountStatus(int num, Integer val) {
        this.num = num;
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public int getCount() {
        return num;
    }

    private final int num;
    private final int val;
}
