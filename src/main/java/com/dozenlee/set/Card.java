package com.dozenlee.set;

import com.dozenlee.gui.DefaultConstants;
import com.dozenlee.set.status.ColorStatus;
import com.dozenlee.set.status.CountStatus;
import com.dozenlee.set.status.FillerStatus;
import com.dozenlee.set.status.ShapeStatus;
import com.sun.istack.internal.NotNull;

/**
 * @author Dozen Lee<br/>
 * 2023/5/14 3:15
 */
public class Card {

    public Card(@NotNull ShapeStatus shape,
                @NotNull ColorStatus color,
                @NotNull FillerStatus filler,
                @NotNull CountStatus count) {
        this.shape = shape;
        this.color = color;
        this.filler = filler;
        this.count = count;
    }

    public ShapeStatus getShape() {
        return shape;
    }

    public ColorStatus getColor() {
        return color;
    }

    public FillerStatus getFiller() {
        return filler;
    }

    public CountStatus getCount() {
        return count;
    }

    public String getResourcePath() {
        return DefaultConstants.CARD_PATH_PREFIX + shape.toString()
                + DefaultConstants.SPLIT + color.toString()
                + DefaultConstants.SPLIT + filler.toString()
                + DefaultConstants.SUFFIX;
    }

    private final ShapeStatus shape;
    private final ColorStatus color;
    private final FillerStatus filler;
    private final CountStatus count;
}
