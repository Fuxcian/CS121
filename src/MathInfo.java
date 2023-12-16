import java.util.Scanner;

public class MathInfo {
    public static void main(String[] args) {
        //Scanner
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter your first number");

        int numOne = Integer.parseInt(console.nextLine());

        System.out.println("Enter the second number");
        int numTwo = Integer.parseInt(console.nextLine());
        int add = (numOne + numTwo);
        int sub = (numOne - numTwo);
        //multiplication
        //division
        //square root
        double sqrt1 = (double) Math.sqrt(numOne);
        //square root of the second number

        System.out.printf("The number %d + %d = %d%n", numOne, numTwo, add);
        System.out.printf("The number %d - %d = %d%n", numOne, numTwo, sub);
        //print mult.
        //print div.

        System.out.println("The square root of %d is = %.2f, numOne, sqrt1");
        //print square root of the second number
        int power1 = (int) Math.pow(numOne, numTwo);
        System.out.printf("The power of %d and %d is: ", numOne, numTwo, power1);
        //second number print
        double log1 = Math.log(numOne);
        System.out.printf("The log of %d is: %.2f", numOne, log1);

        //Math.max()
        System.out.println(Math.max(3,5));
        //Math.min()
        System.out.println(Math.min(3,7));
        System.out.println(Math.abs(-29));

    }
}
