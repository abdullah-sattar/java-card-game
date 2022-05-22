package com.company;

import java.util.ArrayList;

public class Snap extends CardGame {

    CardGame play = new CardGame(new ArrayList<>());

    public void startGame() {
        play.createDeck();
        play.shuffleDeck();
    }

    public Card pickCard() {
        System.out.println(play.getDeckOfCards().get(0).getSymbol() + " of " + play.getDeckOfCards().get(0).getSuit());
        return play.getDeckOfCards().get(0);
    }

    public void removeCard() {
        play.getDeckOfCards().remove(0);
    }
}
