package week2;

import java.util.Scanner;

public class IntegerDiv {
    public static void main(String[] args) {
        //Creating an instance of the Scanner class
        //Console is a scanner object/instance that can be created
        Scanner console = new Scanner(System.in);

        //STRINGS
        String color = "blue";
        color.concat("red");
        System.out.println(color); //-->won't change color to red because the String objects are immutable.
            //.concat()--> method of the String class color = color.concat("red");
        System.out.println(color);

        //Manipulating Strings

        String name = "Laney";
        //.charAt()---> method of String class
        System.out.println(name.charAt(3));
        //.length()---> method of the String class
        System.out.println(name.length());
        //.substring()---> method of the String class
        System.out.println(name.substring(0));
        System.out.println(" ");
        System.out.println(name.substring(0,1));
        //UPPERCASE
        //.toUpperCase()---> method of the String class
        System.out.println(name.toUpperCase());
        //LOWERCASE
        //toLowerCase()---> method of the String class
        System.out.println(name.toLowerCase());
        //.replace()---> method of the String class
        //use the String object.replace()

        System.out.println(name.replace("Helen","Jacob"));

        //Prompts user to enter name
        System.out.println("Enter your name");
        //reads in user input
        String Fname = console.nextLine();
        //prints our name
        System.out.println(Fname);

        System.out.println("Enter in age :");
        //.nextInt()---> Scanner method; if an integer will give an invalid error
        //Integer.parseInt()---> parses through string to get to the Integer values
        //Another wat to read in user input
        //int age = console.nextLine();
        int age = Integer.parseInt(console.nextLine());
        System.out.println(age);

        //.nextDouble()---> Scanner method
        //Double.parseDouble()---> parses through the string to get the Double values
        System.out.println("Enter in gpa:");
        //Another way to read in user input
        //double gpa = console.nextDouble();
        double gpa = Double.parseDouble(console.nextLine());
        System.out.println(gpa);

        //closes out your scanner class console.close();

        //TYPECASTING
        int numOne = 1;
        int numTwo = 4;
        //Casting integer as a double
        double results = (double)numOne/numTwo;
        //System.out.println(results);

        //does integer division then cast as a double
        double result = (double) (numOne/numTwo);
        //System.out.println(results);
    }
}


