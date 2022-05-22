package com.company;

public class Snap extends CardGame {

    public Card pickCard() {
        System.out.println(getDeckOfCards().get(0).getSymbol() + "of" + getDeckOfCards().get(0).getSuit());
        return getDeckOfCards().get(0);
    }

    public void removeCard() {
        getDeckOfCards().remove(0);
    }
}
