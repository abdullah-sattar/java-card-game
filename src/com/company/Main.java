package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Snap snap = new Snap();

        int play = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome! Press enter to pick a card:");

        Card pickedCard = new Card("","",0);
        Card previousCard = new Card("","",0);
        snap.startGame();

        while(play == 1) {
            String enter = scanner.nextLine();
            if (enter.equals("")) {
                pickedCard = snap.pickCard();
                if (pickedCard.getSuit().equals(previousCard.getSuit())) {
                    System.out.println("Winner!");
                    play = 0;
                } else {
                    previousCard = pickedCard;
                    snap.removeCard();
                }
            }
        }
    }
}


