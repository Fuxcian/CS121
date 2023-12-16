package week9.arraysPractice;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        /* An array is a data structure which stores a fixed-size
         * sequential collection of elements of the same type--
         * a collection of variables or values of the same type.
         * (int number1; int number2...) -->
         * [index number] (number[1], number[2]...)
         */

        //FIRST HALF OF DEMO
        //datatype[] variableName; //preferred way
        //examples:
        int[] scores = new int[5]; //declares a variable 'scores' to reference an array of int.
        scores[0] = 88;
        scores[1] = 100;
        scores[2] = 98;
        scores[3] = 100;
        scores[4] = 85;

        char[] letterGrades; //declares a variable 'letterGrades' to reference an array of characters.

        double[] gpas; //declares a variable 'gpas' to reference an array of doubles.

        String[] names = new String[5]; //declares a variable 'names' to reference an array of Strings
        names[0] = "Mary";
        names[1] = "Tom";
        names[2] = "John";
        names[3] = "Jane";
        names[4] = "Lisa";

        System.out.printf("There are %d names in the names array\n", names.length);
        System.out.println("The name at index 0 is " +names[0]);
        System.out.printf("The name at index 1 is %s\n", names[1]);

        //SECOND HALF OF DEMO
        String[] firstNames = {"Mary", "Tom", "John"};
        String[] lastNames = {"Johnson","Jones","Doe"};
        int[] ages = {19,21,19};
        //Print the header: -14 for 14 characters (including blank spaces) left justified
        System.out.printf("%-14s %s\n", "Name", "Age");

        for (int i = 0; i < firstNames.length; i++){
            System.out.printf("%-14s %d\n", firstNames[i] +" "+ lastNames[i], ages[i]);
        }

        //Stops at length of names which is 3: 0-2 will get the 3 elements
        for(int i = 0; i < firstNames.length; i++){
            System.out.println(firstNames[i]);
        }
        System.out.println("What is the loop doing:");
        for (int i = 0; i < firstNames.length; i++){
            System.out.printf("Loop %d: i is %d and gets the name at index %d: %s\n",
                    i + 1, i, i, firstNames[i]);
        }

        System.out.printf("There are %d names in the names array\n", firstNames.length);
        System.out.println("The name at index 0 is " +firstNames[0]);
        System.out.printf("The name at index 1 is %s\n", firstNames[1]);

        String[] firstNames2 = new String[5];
        String[] lastNames2 = new String[5];
        int[] ages2 = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.println("First Name: ");;
            firstNames2[i] = console.nextLine();
            System.out.println("Last Name: ");
            lastNames2[i] = console.nextLine();
            System.out.println("Age: ");
            ages2[i] = Integer.parseInt(console.nextLine());
            System.out.println();
        }
        System.out.printf("%-14s %s\n", "Name", "Age");

        for(int i = 0; i < firstNames.length; i++){
            System.out.printf("%-14s %d\n",
                    firstNames2[i] +" "+ lastNames2[i], ages2[1]);
        }
        console.close();
    }
}
