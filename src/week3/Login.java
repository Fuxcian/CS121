package week3;

import javax.swing.*;

public class Login {
    public static void main(String[] args){
        String userName = "Laney";
        String password = "Pineapple";

        String name = JOptionPane.showInputDialog("Please enter your username");
        String pw = JOptionPane.showInputDialog("Please enter your password");

        if(name.equals(userName))
            if (pw.equals(password)){
                System.out.println("Welcome to CS121");
            }else {
                System.out.println("Password was incorrect");
        }
        else if(!name.equals(userName))
            if (pw.equals(password)){
                System.out.println("Username was incorrect");
            }else {
                System.out.println("Username and password are incorrect");
            }
    }
}
