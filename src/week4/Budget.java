package week4;

import javax.swing.*;
import java.util.Scanner;

public class Budget {
    public static void main(String[] args) {
        //establish variables:

        int total = 0;
        Scanner console = new Scanner(System.in);

        //create budget:
        System.out.println("What is the budget for this month?");
        int budget = Integer.parseInt(console.next());

        //loop to configure expenses:
        while(true){
            String values = JOptionPane.showInputDialog("Enter your expenses for this month, press 'q' to quit");
            if(values.equals("q")){
                System.out.println("Your total expenses are: " +total);
                break;
            } else {
                int num = Integer.parseInt(values);
                total = num + total;
            }
        }
        int end = budget - total;
        System.out.println("Your budget for this month is " +budget+
                " Your total expenses this month " +total+ ". Your final amount is "
                +end+ ".");
    }
}
