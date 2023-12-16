package week11.sortingActivity;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Sorting {
    //Asks user for input:
    Scanner console = new Scanner(System.in);

    /* Asks user for 5 unsorted integers:
     * - loop five times
     * -.add(console.nextLine)
     */
    public ArrayList<Integer> getArray() {
        //Establish array:
        ArrayList<Integer> array = new ArrayList<>();
        //Prompt
        System.out.println("Please enter five random integers: ");
        for (int i = 0; i < 5; i++) {
            //Adds an integer * 5
            array.add(Integer.parseInt(console.nextLine()));
        }
        //Return unsorted method:
        return array;
    }

    //Takes Array Parameter:
    public ArrayList<Integer> sortArray(ArrayList<Integer> array){
        //BUBBLE SORT:
        //Temporary Value:
        int temp;
        //Initial Loop:
        for(int i = 0; i < array.size() - 1; i++) {
            for (int index = 0; index < array.size() - i - 1; index++) {
                //compares unsorted element to next element
                if (array.get(index) > array.get(index + 1)) {
                    //temporarily holds value
                    temp = array.get(index);
                    //assigns next value to current index
                    array.set(index,array.get(index + 1));
                    //array[index] = array[index + 1];
                    //assigns current value to next index
                    array.set(index + 1, temp);
                    //array[index + 1; = temp;
                }
            }
        }
        //Print Essential:
        //System.out.println();
        return array;
    }
}
