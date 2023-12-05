package week5.fileActivity;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppend {
    public static void main(String[] args) throws IOException {
        //creating a file-writer to change the file:
        FileWriter fileWriter = new FileWriter("High Scores.txt", true);
        PrintWriter newtext = new PrintWriter(fileWriter);

        //asks user for more values:
        String name = JOptionPane.showInputDialog("Enter the name of the player: ");
        String score = JOptionPane.showInputDialog("Enter the score of that player: ");

        //writes the values to the existing text file:
        newtext.printf("%s: %s", name, score);
        fileWriter.close();
        newtext.close();

    }
}
