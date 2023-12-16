package week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO {
    public static void main (String[] args) throws FileNotFoundException {
        //File in project folder:
        File inputFile1 = new File("courses.txt");

        try {

            //how to read the file
            Scanner input = new Scanner(inputFile1);

            //Establishes loop to tell it to continue reading:
            while (input.hasNextLine()) {
                //variable
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
