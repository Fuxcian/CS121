package week3;

import javax.swing.*;

public class LectureVideoSepSix {
    public static void main(String[] args){
        boolean csMajor, isStudent, isTeacher, isTeacherCsMajor;
        isStudent = false;
        csMajor = true;
        isTeacher = true;
        isTeacherCsMajor = true;

        //keep in mind this is a quick example and there are better ways to use nested if statements.
        //You can look through the condition.pdf file.
        //*****NESTED IF STATEMENTS******
        if(csMajor == isStudent) {
            System.out.println("This person is a student and a cs major");
        }else{
            if(isTeacher != isStudent) {
                System.out.println("This person us a teacher and may be a csMajor");
            }else if(isTeacher != isStudent){
                System.out.println("This is a teacher and a cs major");

            }
            System.out.println("One of the values for the student or cs major is false");
        }
        //******LOGIC OPERATORS******

        // && --> AND --> this will evaluate to true if either or both expressions joined are true.
        // true && true
        // || --> OR --> this will evaluate to true if either or both expressions joined are true.

        boolean isSunny, isWarm;
        isSunny = true;
        isWarm = false;
        //This will not print out with one is false and the other is true.
        if(isSunny && isWarm){
            System.out.println("Let's get ice cream.");
        }
        //This will print because you only need one expression to be true.
        if(isSunny || isWarm){
            System.out.println("Let's get ice cream.");
        }
        //******TERNARY OPERATORS (OR CONDITIONAL OPERATOR)******
        // - more concise way to write a simple if/else statement.
        // Ex. compared to if you used if-else for the even or odd part of Activity 3
        //Syntax:
        //condition ? expression1 : expression2
        int num = 11;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is : " + result);

        //*******SWITCH STATEMENTS VS. SWITCH EXPRESSIONS******
        //Switch Statements :
        /* - Does not return a value.
         * - Switch statements control the flow of code execution.
         * - Switch statements, need to use break statements to prevent fall-through to the next case.
         * - The default label is used for the default case
         */

        //Display prompt to user to enter a planet.
        String planet = JOptionPane.showInputDialog(null, "Enter a planet");

        //Initialize planetInfo as an empty string.
        String planetInfo = "";

        switch(planet){
            case "earth":
                planetInfo = "Where we live now!";
                break;
            case "mars":
                planetInfo = "This is known as the Red Planet";
                break;
            case "venus":
                planetInfo = "You entered in venus";
                break;
            default:
                planetInfo = "The planet you entered has no info on it within this system.";
                break;
        }
        //Displays in dialog box results
        JOptionPane.showMessageDialog(null, planetInfo);

        //Switch Expression:
        /* - returns a value that can be assigned to a variable or used in a return statement
         *Note: Example below the return value is assigned to planetInfoExpress variable.
         * - Switch expressions automatically prevent fall-through, so you don't break statements.
         * - Switch expressions, the default keyword is used for the default case.
         */
        //Display prompt to user to enter a planet.
        String planetExpress = JOptionPane.showInputDialog("Enter a planet");

        //Declare a String Variable planetInfoExpress will have the return value stored in it.
        String planetInfoExpress = switch(planetExpress){
            case "earth" -> "This is where you live";
            case "mars" -> "This is known as the Red Planet";
            case "venus" -> "You entered venus";
            default -> "The planet you entered has no info within the system.";
        };
        //Displays in dialog box results
        JOptionPane.showMessageDialog(null, planetInfoExpress);
    }
}
