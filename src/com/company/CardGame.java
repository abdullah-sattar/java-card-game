package com.company;

import java.util.ArrayList;

public class CardGame {
    private ArrayList<Card> deckOfCards = new ArrayList<>();

    public CardGame(ArrayList<Card> deckOfCards) {
        this.deckOfCards = deckOfCards;
    }

    public CardGame() {

    }

    public ArrayList<Card> getDeckOfCards() {
        return deckOfCards;
    }

    public void setDeckOfCards(ArrayList<Card> deckOfCards) {
        this.deckOfCards = deckOfCards;
    }

    public void createDeck() {
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        String[] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suit = {"Heart", "Club", "Diamond", "Spade"};
        for(int i=0; i<suit.length; i++) {
            for (int j = 0; j < symbols.length; j++) {
                Card card = new Card(suit[i], symbols[j], values[j]);
                getDeckOfCards().add(card);
            }
        }
    }
}
