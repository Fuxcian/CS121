package week15.dateFormatActivity;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        TotalCalories total = new TotalCalories();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount of calories allowed per day by a diet");
        int calories = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the date the diet starts as mm/dd/yyyy: ");
        String startDate = scanner.nextLine();
        System.out.println("Enter the date the diet stops as mm/dd/yyyy: ");
        String endDate = scanner.nextLine();

        int calorieIntake = total.calcCalories(calories, startDate, endDate);
        System.out.printf("Total calories = %d", calorieIntake);
    }
}