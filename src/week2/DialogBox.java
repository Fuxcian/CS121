package week2;

import javax.swing.*;

public class DialogBox {
    public static void main(String[] args) {
        //JOptionPane.showInputDialog()---> you can use prompt user for info.

        String name = JOptionPane.showInputDialog("Enter your name");
        //JOptionPane.showMessageDialog()---> you ca use this to show user input

        JOptionPane.showMessageDialog(null, "The name you entered: " + name);

        //Integer.parseInt(JOptionPane.showInputDialog()); ---> parses the user info to return an integer
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null, "Your age is: " + age);

        //Double.parseDouble(JOptionPane.showInputDialog()); ---> parses the user info to return a double
        double gpa = Double.parseDouble(JOptionPane.showInputDialog("Enter your gpa: "));
        JOptionPane.showMessageDialog(null, "Your gpa is: " + gpa);

    }
}
