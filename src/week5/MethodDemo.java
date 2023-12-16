package week5;

import javax.swing.*;
import java.util.Random;

public class MethodDemo {
    // Method: main-- main method is automatically called and runs
    /* Level of Access: public-- this is an access modifier that makes
      the method accessible from anywhere in the program
     */
    /* Return Type: void-- this is no value is returned.
     * it just performs a task without producing a result that
     * needs to be returned.
     */
    /* Parameters: String[] args-- accepts an array of strings as arguments.
     * These arguments are typically pass command-line arguments to the program
     * when it is expected from the command line.
     */
    public static void main(String[] args) {
        /* Methods:
         * access modifiers (briefly) public, private, static--
         * we will go over later.
         * Return Types:
         * parameter lists --> arguments
         * method body
         */
        //Prompting the user for information
        //Taking 2 Strings and 1 integer
        String Name = JOptionPane.showInputDialog("Enter user's name: ");
        String passW = JOptionPane.showInputDialog("Enter user's password: ");
        int score = Integer.parseInt(JOptionPane.showInputDialog("Enter user's score: "));

        //Calling the displayUserInfo() method
        //Using camelCase when creating a method
        //displayUserInfo(String, int, String);
        //Printing out returned value
        System.out.println(displayUserInfo(Name, passW, score));

        //Passing in arguments into a method
        String userInfo = displayUserInfo("Giselle", "123%^khj", 77);
        System.out.println(userInfo);
        //Showing the difference between arguments and variables
        System.out.println("Hello"); //argument
        String welcomeMessage = "Hello";
        System.out.println(welcomeMessage); //variable

        //Calling to the RandomExtraPoints() method
        int newpoints = 0;
        newpoints = randomExtraPoints(score); //variable passed
        newpoints = randomExtraPoints(77); //arguments passed

        /* Printing out values
         * using JOptionPane and Scanner
         * Make sure you press okay for JOption pane dialog box
         * so it can print out the scanner information below it.
         */
        JOptionPane.showMessageDialog(null, randomExtraPoints(77));
        System.out.println(randomExtraPoints(score));
        System.out.println(newpoints);
    }
    //Method: randomExtraPoints()
    //Method Return type: int
    //Parameters(s): (1) int points
    /* Functionality:
     * Takes in the original points of the user and uses a random
     * generator to get a random number.
     * If the random number is even a random number will be added
     * to the original points. If the random number is odd it will
     * return the original poitns of the user.
     */
    public static int randomExtraPoints(int points){
        //Instance of Random class
        Random rand = new Random();
        //generate a random number between 1 and 10(inclusive)
        int randomNumber = rand.nextInt(10) + 1;
        //check if the random number is even
        if(randomNumber % 2 == 0) {
            /*if it's een,return random number between 1 and 10
             * added to the points
             */
            //Option 2
            int randomNumberFinal = rand.nextInt(10) + 1;
            int newpoints = randomNumberFinal + points;
            return newpoints;
            //Option 1
            //return rand.nextInt(10) + 1;
        }else {
            //If it's not eve, return 0 extra points.
            return points;
            //Option 1:
            //return 0;
        }
        }
        //Method: displayUserInfo()
        //Method Return type: String
        //Parameter(s): (3) String Names, String password, int points
        /* Takes in the username, password and points of the user
         * formats the information and returns a formatted string
         * to display the users information
         */
        public static String displayUserInfo(String Names, String password, int scores){
            //assigned userInfo a formatted String to display.
            String userInfo = String.format("%nName: %-20s Password: %-20s Score: %d", Names,password,scores);
            //returns a string
            return userInfo;
    }

}
