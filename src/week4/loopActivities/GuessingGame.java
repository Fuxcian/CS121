package week4.loopActivities;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        boolean loop;
        loop = true;

        while(loop){
            System.out.println("Guess a number between 1-100, press 'q' to quit");
            String guess = console.nextLine();
            int answer = 32;

            if(guess.equals("q")){
                System.out.println("You've quit");
                loop = false;
            }
            else{
                int guess2 = Integer.parseInt(guess);
                if (guess2 == answer) {
                    System.out.println("Correct!");
                    loop = false;
                }if(guess2 > answer){
                    System.out.println("That is too high, try again: ");
                }if(guess2 < answer){
                    System.out.println("That is too low, try again: ");

                }}
        }

        }

    }
