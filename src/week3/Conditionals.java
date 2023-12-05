package week3;

public class Conditionals {
    public static void main(String[] args){

        /*
        * Conditional Statements:
        * - if statements
        * - else-if statements
        * - else statements
        * - switch statements
         */

        //Declaring variable
        int age;
        double gpa;
        char letterGrade;
        boolean csMajor, isStudent;
        String name;

        //Initialize variables
        age = 25;
        gpa = 1.6;
        letterGrade = 'A';
        isStudent = true;
        csMajor = true;

        //RELATIONAL OPERATORS
        //<, >, <=, >=, == (EQUAL TO), != (NOT EQUAL TO)
        //== --> PRIMITIVE VARIABLES COMPARE IF VALUE IS == TO VALUE
        //== --> FOR REFERENCE TO OBJECTS IF OBJECT IS == TO OBJECT IS REFERENCING THE MEMORY ADDRESS.
        if(csMajor == isStudent) {
            System.out.println("This person is a student and a CS Major");
        }else {
            System.out.println("One of the values for the student or CS Major is false.");
        }
        //****** FOR STRING *******
        //EXAMPLE:
        //String x = "helen"
        //String y = "Helen"
        // .equals() --> for Strings METHOD
        // !x.equals(y) --> not equals
        name = "Laney";
        String name2 = "laney";

        if(!name.equals(name2)) {
            System.out.printf("The name %s is not equal to name2 %s ", name, name2);
        }else {
            System.out.println("The names are equal");
        }

        //WORKING WITH IF AND ELSE STATEMENT USING VARIABLE AGE
        if (gpa >= 4.0) {
            System.out.println("You received an A");
        }else if(gpa >= 3.6){
            System.out.println("You received an A-");
        }else if (gpa >= 2.7) {
            System.out.println("You received a B");
        }else if(gpa >= 1.7) {
            System.out.println("You received a C");
        }else{
            System.out.println("You received below a C");
        }
        //SYNTAX OF CONDITION STATEMENTS:

        //IF STATEMENT
        /* if(condition){
            //executes the code if the condition is true
            }

        //ELSE STATEMENT
           if(condition){
            //executes the code if the condition is true
           }else{
            //executes the code if the condition is false.
           }
        //IF-ELSE-IF-ELSE STATEMENT - MULTIPLE CONDITIONS
           if(condition1){
            //execute the code if condition1 is true.
           }else if(condition2){
            //execute the code if condition2 is true.
           }else{
            //execute code if the above conditions are not met
        */
    }
}
