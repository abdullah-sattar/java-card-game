package com.company;

import java.util.ArrayList;

public class Snap extends CardGame {

    CardGame snap = new CardGame(new ArrayList<>());

    public Card pickCard() {
        snap.createDeck();
        snap.shuffleDeck();
        System.out.println(snap.getDeckOfCards().get(0).getSymbol() + " of " + snap.getDeckOfCards().get(0).getSuit());
        return snap.getDeckOfCards().get(0);
    }

    public void removeCard() {
        snap.getDeckOfCards().remove(0);
    }
}
