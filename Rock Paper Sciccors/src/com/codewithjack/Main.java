package com.codewithjack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        System.out.println("Lets Play Rock, Paper, Scissors, Lizard, Spock");

        while(true) {

            System.out.println("Please type in rock, paper, scissors, lizard, spock or exit to leave the game");
            String myMove = in.nextLine();

            if(myMove.equals("exit")) {
                break;
            }

            if(!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors") && !myMove.equals("lizard") &&  !myMove.equals("spock")) {

                System.out.println("Your move isn't valid!");

            } else {

                int rand = (int)(Math.random()*5);

                String opponentMove = "";
                if(rand == 0) {
                    opponentMove = "rock";
                } else if(rand == 1) {
                    opponentMove = "paper";
                } else if(rand == 2){
                    opponentMove = "scissors";
                } else if(rand == 3){
                    opponentMove = "Lizard";
                } else{
                    opponentMove = "Spock";
                }
                System.out.println("Opponent move: " + opponentMove);

                if(myMove.equals(opponentMove)) {
                    System.out.println("It's a tie!");
                } else if((myMove.equals("rock") && opponentMove.equals("scissors")) || (myMove.equals("scissors") && opponentMove.equals("paper")) || (myMove.equals("paper") && opponentMove.equals("rock")) || (myMove.equals("lizard") && opponentMove.equals("spock")) || (myMove.equals("spock") && opponentMove.equals("scissors")) || (myMove.equals("scissors") && opponentMove.equals("lizard")) || (myMove.equals("lizard") && opponentMove.equals("paper")) || (myMove.equals("paper") && opponentMove.equals("spock")) || (myMove.equals("spock") && opponentMove.equals("rock"))) {
                    System.out.println("You won!");
                } else {
                    System.out.println("You lost!");
                }
            }

        }

        //Print a final message for the user
        System.out.println("Thanks for playing Rock, Paper, Scissors, Lizard, Spock!");
    }
}

