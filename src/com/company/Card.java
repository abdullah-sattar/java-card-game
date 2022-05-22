package com.company;

import java.sql.Array;

public class Card {
    private String suit;
    private String symbol;
    private int value;

    public Card(String symbol, String suit, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

//{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
//        {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
//        {"Heart", "Club", "Diamond", "Spade"};
