package week5;

import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

public class FileOutput {
    public static void main(String[] args) throws FileNotFoundException {
        File outputFile = new File("mycourses.txt");
        PrintWriter output = new PrintWriter(outputFile);
        String course;
        String credits;
        String score;

        /* Write a header for the file with spaces between
         * each.
         */
        output.printf("%s %s %s\n", "course", "credits", "score");
        //Ask user for info for 3 courses
        for (int i = 1; i <= 3; i ++) {
            course = JOptionPane.showInputDialog(String.format("Enter name of course %d", i));
            credits = JOptionPane.showInputDialog("Enter the course credits");
            score = JOptionPane.showInputDialog("Enter the course score");
            //Print info on one line with spaces between
            output.printf("%s %s %s\n", course, credits, score);
        }
        output.close();

    }
}
