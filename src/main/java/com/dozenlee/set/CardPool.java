package com.dozenlee.set;

import com.dozenlee.util.SetLogic;

import java.util.List;
import java.util.Queue;

/**
 * @author Dozen Lee<br/>
 * 2023/5/14 12:47
 */
public class CardPool {

    private CardPool() {
        genCardSeq();
    }

    public int getSeqCurLength() {
        return cardSeq.size();
    }

    public void genCardSeq() {
        List<Card> fullCards = SetLogic.getFullCards();
        cardSeq = SetLogic.genCardSeqByCardList(fullCards);
    }

    private Queue<Card> cardSeq;

    public static CardPool getInstance() {
        if (instance == null) {
            instance = new CardPool();
        }
        return instance;
    }

    private static CardPool instance;
}
