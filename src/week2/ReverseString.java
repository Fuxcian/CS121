package week2;

import javax.swing.JOptionPane;

public class ReverseString {
    public static void main(String[] args){
        //Prompt user to take in name
        String name = JOptionPane.showInputDialog("Enter in your name!");

        JOptionPane.showMessageDialog(null,String.format("The original name that you enter is %s%n",name));

        //.ToUpperCase()
        String UpperName = name.toUpperCase();

        JOptionPane.showMessageDialog(null,String.format("The capitalized %s is %s", name, UpperName));
        //.ToLowerCase()
        String LowerName = name.toLowerCase();

        JOptionPane.showMessageDialog(null,String.format("The lower case of %s is %s", name, LowerName));

        //Reverse the string
        //OPTION 1: StringBuilder Instance or object to get access to the reverse method.
        StringBuilder reversedName = new StringBuilder(name);
        //reversedname.append(name);
        String revName = String.valueOf(reversedName.reverse());

        JOptionPane.showMessageDialog(null, String.format("The reverse of %s is %s",name, revName));
        //OPTION 2: for loop
        String revrevName = "";
        char[] newName = name.toCharArray();
        for(int i = newName.length-1;i>0;i--){

            revrevName += newName[i];
        }
        JOptionPane.showMessageDialog(null, String.format("The second reverse of %s is %s ",name, revrevName));

        //OPTION 3: for loop
        String revrevrevName = " ";
        for(int i = name.length()-1;i>=0;i--){
            revrevrevName += name.charAt(i);
        }
        JOptionPane.showMessageDialog(null,String.format("The third reverse of %s is %s ", name, revrevrevName));
    }
}
