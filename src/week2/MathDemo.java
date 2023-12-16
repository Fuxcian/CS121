package week2;

import java.util.Scanner;

public class MathDemo {
    public static void main(String[] args){
        //Math methods
        //Creating an instance of the Scanner class
        Scanner console = new Scanner(System.in);

        System.out.println("Enter your first integer: ");
        int numOne = Integer.parseInt(console.nextLine());

        System.out.println("Enter your second integer: ");
        int numTwo = Integer.parseInt(console.nextLine());

        //Addition +
        int add = (numOne + numTwo);
        System.out.printf("number one %d + number two %d = %d%n", numOne, numTwo, add);

        //Subtraction -
        int sub = (numOne - numTwo);
        System.out.printf("number one %d - number two %d = %d%n", numOne, numTwo, sub);

        //Multiplication *
        int mult = (numOne * numTwo);
        System.out.printf("number one %d * number two %d = %d%n", numOne, numTwo, mult);

        //Division /
        double div = ((double)numOne/numTwo);
        System.out.printf("number one %d / number two %d = %.2f%n", numOne, numTwo, div);

        //Square Root
        double sqrt1 = Math.sqrt(numOne);
        double sqrt2 = Math.sqrt(numTwo);
        System.out.printf("The square root of %d is: %.2f%n", numOne,sqrt1);
        System.out.printf("The square root of %d is: %.2f%n", numTwo, sqrt2);

        //logarithm Math.log()
        double logR = Math.log(numOne);
        System.out.printf("The log of %d is: %.2f%n", numOne, logR);

        //Power Math.pow(x,y)
        int pow = (int)Math.pow(numOne, numTwo);
        double pow2 = Math.pow(numOne, numTwo);
        System.out.printf("Note: Type casting int. The power of %d and %d is = %d%n", numOne, numTwo, pow);

        System.out.printf("Note: using double the power of %d and %d is = %.2f%n", numOne, numTwo, pow2);

        //Math.max(x,y);
        int maxNum = Math.max(numOne, numTwo);
        System.out.printf("The maximum value of the two calues %d and %d is %d%n", numOne, numTwo, maxNum);
        //System.out.println(Math.max(1,4));

        //Math.min(x,y);
        int minNum = Math.min(numOne, numTwo);
        System.out.printf("The minimum value of the two claues %d and %d is %d%n", numOne, numTwo, minNum);

        //Math.abs(-x);
        int abso = Math.abs(-88);
        System.out.printf("The absolute value of -88 is: %d%n", abso);

        //Math.round(x);
        long roundNum = Math.round(4.48);
        System.out.printf("Note: using the data type round 4.48 to the nearest integer will result in %d%n", roundNum);
        int roundNum2 = (int)Math.round(4.48);
        System.out.printf("Note: using int type casting round 4.48 to the nearest integer will result in %d%n", roundNum2);

    }
}
