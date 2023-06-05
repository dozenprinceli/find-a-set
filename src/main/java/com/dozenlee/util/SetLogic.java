package com.dozenlee.util;

import com.dozenlee.set.Card;
import com.dozenlee.set.status.ColorStatus;
import com.dozenlee.set.status.CountStatus;
import com.dozenlee.set.status.FillerStatus;
import com.dozenlee.set.status.ShapeStatus;
import com.sun.istack.internal.NotNull;

import java.util.*;

/**
 * @author Dozen Lee<br/>
 * 2023/5/14 13:50
 */
public class SetLogic {

    public static final int SET_CARD_COUNT = 3;
    public static final int SET_FULL_CARD_COUNT = 81;

    /**
     * Private utility constructor
     */
    private SetLogic() {
    }

    /**
     * Get full set card list
     *
     * @return full set card list
     */
    public static List<Card> getFullCards() {
        if (fullCards == null) {
            genFullCards();
        }

        return fullCards;
    }

    /**
     * Generate full set card list
     */
    private static void genFullCards() {
        fullCards = new ArrayList<>();
        for (ShapeStatus shape : ShapeStatus.values()) {
            for (ColorStatus color : ColorStatus.values()) {
                for (FillerStatus filler : FillerStatus.values()) {
                    for (CountStatus count : CountStatus.values()) {
                        Card card = new Card(shape, color, filler, count);
                        fullCards.add(card);
                    }
                }
            }
        }
    }

    /**
     * Shuffle card list to a queue
     *
     * @param cards src card list
     * @return card sequence
     */
    public static Queue<Card> genCardSeqByCardList(@NotNull List<Card> cards) {
        int size = cards.size();
        List<Integer> idxList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            idxList.set(i, i);
        }
        Collections.shuffle(idxList);

        Queue<Card> cardSeq = new LinkedList<>();
        for (Integer idx : idxList) {
            cardSeq.add(cards.get(idx));
        }
        return cardSeq;
    }

    /**
     * Judge if a cards array is a set
     *
     * @param cards cards array
     * @return if the cards array is a set
     */
    public static boolean isSet(Card[] cards) {
        if (cards == null || cards.length != SET_CARD_COUNT) {
            return false;
        }

        int shapeSum = 0;
        int colorSum = 0;
        int fillerSum = 0;
        int countSum = 0;
        for (Card card : cards) {
            shapeSum += card.getShape().getVal();
            colorSum += card.getColor().getVal();
            fillerSum += card.getFiller().getVal();
            countSum += card.getCount().getVal();
        }

        return shapeSum % SET_CARD_COUNT == 0
                && colorSum % SET_CARD_COUNT == 0
                && fillerSum % SET_CARD_COUNT == 0
                && countSum % SET_CARD_COUNT == 0;
    }

    private static List<Card> fullCards;
}
