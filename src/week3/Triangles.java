package week3;

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter your first integer: ");
        int numOne = Integer.parseInt(console.nextLine());
        System.out.println("Enter your second integer: ");
        int numTwo = Integer.parseInt(console.nextLine());
        System.out.println("Enter your third integer: ");
        int numThree = Integer.parseInt(console.nextLine());

        //Equilaterals and Isosceles
        /*I have the suspicion I'm using too much code
         * ask about clean-up
         */

        if (numOne == numTwo) {
            if (numOne == numThree)
                System.out.println("This is an equilateral");
            else {
                System.out.println("This is an isosceles");
            }
        }else if (numOne == numThree) {
            if (numOne == numTwo)
                System.out.println("This is an equilateral");
            else {
                System.out.println("This is an isosceles");
            }
        }else if (numTwo == numThree) {
            if (numTwo == numOne)
                System.out.println("This is an equilateral");
            else {
                System.out.println("This is an isosceles");
            }
        }
        //Scalene
        if (numOne != numTwo) {
            if (numTwo != numThree)
                if (numThree != numOne)
                    System.out.println("This is a scalene");
        }
    }
}
