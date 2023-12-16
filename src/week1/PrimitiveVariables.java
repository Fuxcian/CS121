package week1;

public class PrimitiveVariables {
    public static void main(String[] args){

        //Declare primitive variables
        /*
        int - %d
        double - %.2f
        character - %c
        boolean - %b
        string - %s
        new line - %n
         */

        int age;
        double gpa;
        char letterGrade;
        boolean csMajor;
        String name;

        //Initialize variables
        age = 20;
        gpa = 3.8;
        letterGrade = 'A';
        csMajor = true;
        name = "Laney";

        String favoriteColor = "Green";

        /*Printing variables
        * print
        * println
        * printf - formatting
         */
        System.out.printf("The age of this person is: %d%n", age);
        System.out.printf("The gpa is: %.2f%n", gpa);
        System.out.printf("The letter grade is: %c%n", letterGrade);
        System.out.printf("Is it true that your major is computer science? %b%n", csMajor);
        System.out.printf("This persons name is: %s%n", name);

        System.out.println("Your age is: " + age);
    }
}
