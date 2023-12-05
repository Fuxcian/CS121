package week2;
//import javax.swing.*;
import javax.swing.JOptionPane;

public class DiaBoxPractice {
    public static void main(String[] args) {
        String name;
        int hours;
        double payRate;
        double grossPay;
        //show message
        //JOption.Pane.showMessageDialog(null, "This is a message dialog");

        name = JOptionPane.showInputDialog("What is your name?");
        //System.out.println(name);

        //Integer.parseInt()
        hours = Integer.parseInt(JOptionPane.showInputDialog("How many hours did you work this week?"));
        //"15"
        System.out.println(hours);
        //Double.parseDouble()
        payRate = Double.parseDouble(JOptionPane.showInputDialog("What is your hourly pay rate?"));
        grossPay = hours * payRate;

        JOptionPane.showMessageDialog(null, String.format("Hello %s." + "\n Your gross pay is $%.2f", name, grossPay));

        System.exit(0);
    }
}
