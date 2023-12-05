package week3;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = Integer.parseInt(console.nextLine());

        if (num % 2 == 0 ){
            /* I was under the assumption that '%' only divided
             * Ask why it also checks general divisibility and why == 0
             * makes it true
             */
            System.out.println("You've entered an even number");
        }else{
            System.out.println("You've entered an odd number");
        }
    }
}
