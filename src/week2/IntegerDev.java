package week2;

import java.util.Scanner;

public class IntegerDev {
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
        //Integer.parseInt()---> parses through the string to get to the Integer values
        //Another way to read in user input
        //int age = console.nextLine();
    }
}


