package week4;

import javax.swing.*;

public class whileLoopPractice {
    public static void main(String[] args){
        //SYNTAX - WHILE LOOPS
        /* while(condition)-- execute code will
         * be executed.
         * do-- code that is executed at least one time
         * before.
         * while(true){if(condition){break;}}
         */

        //***** WHILE LOOP() with true as condition*****
        //* use break; statements to leave while loop
        while(true){
            String favTVshow = JOptionPane.showInputDialog("Enter your favorite show");
            //break;
            if(!favTVshow.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Your favorite TV show is " + favTVshow);
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Please enter a valid tv show.");
                break;
            }
        }
        //Prompt user
        int x = 7;
        //Scanner console = new Scanner(System.in);
        System.out.println("Guess a num 1 - 10 or q t quit");
        //String values = JOptionPane.showInputDialog("Guess a num... to quit");
        while(true){
            String values = JOptionPane.showInputDialog("Guess a number between 1 and 10 or enter q quit.");
            if(values.equals("q")){
                JOptionPane.showMessageDialog(null, "You quitter!!!");
                break;
            } else {
                int num = Integer.parseInt(values);
                if(num > x){
                    JOptionPane.showMessageDialog(null, "Too High");
                } else if(num < x){
                    JOptionPane.showMessageDialog(null, "Too Low");
                } else {
                    JOptionPane.showMessageDialog(null, "correct");
                    break;
                }
            }
        }
        //initialized as 0
        int num = 0;
        //***** DO WHILE LOOP *****
        do{
            /*make sure that the cose is executed at least one more time before
             * checking the condition.
             */
            System.out.println("The number is: " + num);
            num++;
            System.out.println("This is number after incrementing");
        } while(num <= 6);
        //***** WHILE LOOP ()*****
        // while(7 <= 6) {}
        while(num <= 6){
            System.out.println("The number is: " +num);
            //increment num
            //num++;
            num++;
            System.out.println("This is number after incrementing " +num);
        }
    }
}