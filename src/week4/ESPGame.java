package week4;

import java.util.Random;
import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);

        //Initializing variables:
        Random rand = new Random();
        String color = "";
        int correct = 0;

        for(int i = 1; i <=10; i++){
            //Ask question:
            System.out.println("What color has the computer chosen?");

            //Random number:
            int randomNumber = rand.nextInt(4);
            if(randomNumber == 0){
                color = "red";
            } else if(randomNumber == 1){
                color = "green";
            } else if(randomNumber == 2){
                color = "blue";
            } else if(randomNumber == 3){
                color = "orange";
            } else if(randomNumber == 4){
                color = "yellow";
            }

            //Insert response:
            String answer = console.nextLine();

            //Reveal computer answer:
            System.out.println("The computer chose: " +color+ ".");

            //Correct count:
            if(answer.equals(color)){
                correct++;
            }
        }
        System.out.println("You got " +correct+ " out of 10 correct.");
    }
}
