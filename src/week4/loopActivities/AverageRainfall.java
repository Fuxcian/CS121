package week4.loopActivities;

import java.util.Scanner;

public class AverageRainfall {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        System.out.println("How many years are we calculating for average rainfall?");
        int years = Integer.parseInt(console.nextLine());
        int inches = 0;

        for(int i = 1; i <= years; i++){
            for(int i2 = 1; i2 <= 12; i2++){
                System.out.println("How many inches of rainfall for month " +i2+ " in year " +i+ "?");
                inches += Integer.parseInt(console.nextLine());
            }

        }
        int avg = inches/(years*12);
        System.out.println("The average rainfall per month for theis set of years is: " +avg+ ".");
        System.out.println("The number of total months: " +(years*12)+ ".");
        System.out.println("The total number of rainfall across the period years: " +inches+ ".");

    }
}
