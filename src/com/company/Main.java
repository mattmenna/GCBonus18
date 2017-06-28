package com.company;

/*
The application prompts the user to choose between two options.
The application will create a story based on user selected options.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name;
        int caseNumber = 0;
        char playGame;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome! What is your name?");
        name = scnr.nextLine();
        System.out.println("Hi " + name);
        System.out.println("Would you like to play a game?");
        playGame = scnr.nextLine().charAt(0);

        if (playGame == 'y') {

            switch (caseNumber) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    break;
            } // end Switch
        } // game loop

    } // end Main

} // end Class
