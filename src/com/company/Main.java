package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name;
        int caseNumber;
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
            } // end Switch
        } // game loop

    } // end Main

} // end Class
