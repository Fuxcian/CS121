package week5.fileActivity;

import java.util.Scanner;
import java.io.File;

public class FileRead {
    public static void main(String[] args){
        //give program the file:
        File text1 = new File("High Scores.txt");

        //try-catch to test blocks at a time:
        try {
            //method to read new lines:
            Scanner read = new Scanner(System.in);

            //read till it reaches proper end:
            while(read.hasNextLine()){

            read.close();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
