package com.company;

/*
The application prompts the user to choose between two options.
The application will create a story based on user selected options.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name;
        String caseNumber;
        char playGame;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome! What is your name?");
        name = scnr.nextLine();
        System.out.println("Hi " + name);
        System.out.println("Would you like to play a game?");
        playGame = scnr.nextLine().charAt(0);

        if (playGame == 'y') {
            System.out.println("Excellent! You are walking across a field and you encounter a fire-breathing dragon!");
            System.out.println("What would you do?");
            caseNumber = scnr.nextLine().toLowerCase();
            monsterSelect(caseNumber);

        } // end Switch
    } // Main loop


    private static void monsterSelect(String i) {
        switch (i) {
            case "face the best":
                System.out.println("You faced the beast");
                break;
            case "run away":
                System.out.println("You ran away");
                break;
            default:
                break;
        } // end of switch

    } // end of method

} // end Class