package week5.fileActivity;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;


public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        //give program the file:
        File text1 = new File("High Scores.txt");
        PrintWriter header = new PrintWriter(text1);
        String name;
        String score;

        //header:
        header.printf("%s: %s\n", "Name", "Score");
        //asks user for user input:
        for (int i = 0; i < 1; i++) {
            name = JOptionPane.showInputDialog("Enter name of player");
            score = JOptionPane.showInputDialog("Enter the score for this user");
            header.printf("%s: %s\n", name, score);
        }
        header.close();
    }
}
