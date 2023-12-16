package week2;

import javax.swing.*;

public class UserName {
    public static void main(String[] args){
        String firstName = JOptionPane.showInputDialog("Enter in your first name!");
        String lastName = JOptionPane.showInputDialog("Enter in your last name!");

        JOptionPane.showMessageDialog(null,String.format("The original name that you enter is %s %s",firstName, lastName));

        //.ToUpperCase()
        String UpperName = firstName.toUpperCase();
        String UpperName2 = lastName.toUpperCase();

        JOptionPane.showMessageDialog(null,String.format("The capitalized %s %s is %s %s", firstName, lastName, UpperName, UpperName2));
        //.ToLowerCase()
        String LowerName = firstName.toLowerCase();
        String LowerName2 = lastName.toLowerCase();

        JOptionPane.showMessageDialog(null,String.format("The lower case of %s %s is %s %s", firstName, lastName, LowerName, LowerName2));

        StringBuilder reversedName = new StringBuilder(firstName);
        StringBuilder reversedName2 = new StringBuilder(lastName);
        //reversedname.append(name);
        String revName = String.valueOf(reversedName.reverse());
        String revName2 = String.valueOf(reversedName2.reverse());

        JOptionPane.showMessageDialog(null, String.format("The reverse of %s %s is %s %s",firstName, lastName, revName, revName2));

    }
}
