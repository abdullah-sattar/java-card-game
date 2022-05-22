package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Snap snap = new Snap();

        int play = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println("Player 1 please enter your name:");
        String name1 = scanner.nextLine();
        Player player1 = new Player(name1);
        System.out.println("Player 2 please enter your name:");
        String name2 = scanner.nextLine();
        Player player2 = new Player(name2);
        System.out.println("Ready, set, go! press enter to pick a card:");

        Card pickedCard = new Card("","",0);
        Card previousCard = new Card("","",0);
        snap.startGame();

        while(play == 1) {
            System.out.println(" ");
            System.out.println(player1.getName() + "'s turn:");
            String enter1 = scanner.nextLine();
            if (enter1.equals("")) {
                pickedCard = snap.pickCard();
                if (pickedCard.getSymbol().equals(previousCard.getSymbol())) {
                    System.out.println(player1.getName() + " is the Winner!");
                    play = 0;
                } else {
                    previousCard = pickedCard;
                    snap.removeCard();
                }
            }
            System.out.println(" ");
            System.out.println(player2.getName() + "'s turn:");
            String enter2 = scanner.nextLine();
            if (enter2.equals("")) {
                pickedCard = snap.pickCard();
                if (pickedCard.getSymbol().equals(previousCard.getSymbol())) {
                    System.out.println(player2.getName() + " is the Winner!");
                    play = 0;
                } else {
                    previousCard = pickedCard;
                    snap.removeCard();
                }
            }
        }
    }
}


