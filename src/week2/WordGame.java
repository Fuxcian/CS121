package week2;

import javax.swing.*;

public class WordGame {
    public static void main(String[] args){
        //Initializing dialog boxes and variables
        String name = JOptionPane.showInputDialog("Please enter your name.");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        String city = JOptionPane.showInputDialog("Please enter your city.");
        String college = JOptionPane.showInputDialog("Please enter your college.");
        String major = JOptionPane.showInputDialog("Please enter your major.");
        String animal = JOptionPane.showInputDialog("Please enter an animal.");
        String petName = JOptionPane.showInputDialog("Please enter a pet's name.");

        //Dialog output
        System.out.println("There once was a person named " +name+
                " who lived in " +city+ ".\nAt the age of " +age+
                ", " +name+ " went to college at " +college+ ".\n"
                +name+ " graduated with a major in " +major+ ".\nThen, "
                +name+ " adopted a(n) " +animal+ ", named " +petName+ ".\nThey both lived happily ever after!");


    }
}
