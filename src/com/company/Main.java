package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        CardGame game = new CardGame(new ArrayList<>());
        game.createDeck();
        game.shuffleDeck();
        System.out.println(game.getDeckOfCards().size());
        for (Card card : game.getDeckOfCards()) {
            System.out.println(card.getSuit() + " " + card.getSymbol() + " " + card.getValue());
        }
    }
}
