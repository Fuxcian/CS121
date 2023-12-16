package week4.loopActivities;

import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        System.out.println("How many students are there?");
        int students = Integer.parseInt(console.nextLine());

        System.out.println("How many test scores are there per student?");
        int test = Integer.parseInt(console.nextLine());

        for(int i = 1; i <= students ; i++) {
            System.out.println("What are each of the test scores for student " +i+ "?");
            int scores = 0;
            for(int i2 = 1; i2 <= test; i2++){
                System.out.println("Enter score " +i2+ ":");
                scores += Integer.parseInt(console.nextLine());
                //Issue with looping and averaging.

            }
            double avg = (double) scores /test;
            System.out.println("The average for student " +i+ " is: " +avg);

        }

        }
}
