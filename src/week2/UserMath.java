package week2;

import java.util.Scanner;

public class UserMath {
    public static void main(String[] args){
        //Creating a scanner
        Scanner console = new Scanner(System.in);

        System.out.println("Enter your first integer: ");
        int numOne = Integer.parseInt(console.nextLine());

        System.out.println("Enter your second integer: ");
        int numTwo = Integer.parseInt(console.nextLine());

        int add = (numOne + numTwo);
        System.out.printf("number one %d + number two %d = %d%n", numOne, numTwo, add);
        int sub = (numOne - numTwo);
        System.out.printf("number one %d - number two %d = %d%n", numOne, numTwo, sub);
        int mult = (numOne * numTwo);
        System.out.printf("number one %d * number two %d = %d%n", numOne, numTwo, mult);
        double div = ((double)numOne/numTwo);
        System.out.printf("number one %d / number two %d = %.2f%n", numOne, numTwo, div);

        double sqrt1 = Math.sqrt(numOne);
        double sqrt2 = Math.sqrt(numTwo);
        System.out.printf("The square root of %d is: %.2f%n", numOne,sqrt1);
        System.out.printf("The square root of %d is: %.2f%n", numTwo, sqrt2);

        double logR = Math.log(numOne);
        double logR2 = Math.log(numTwo);
        System.out.printf("The log of %d is: %.2f%n", numOne, logR);
        System.out.printf("The log of %d is: %.2f%n", numTwo, logR2);

        int pow = (int)Math.pow(numOne, numTwo);
        double pow2 = Math.pow(numOne, numTwo);
        System.out.printf("The power of %d and %d is = %d%n", numOne, numTwo, pow);
    }
}
