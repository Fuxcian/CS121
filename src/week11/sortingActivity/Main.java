package week11.sortingActivity;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Instance of Sorting Class:
        Sorting sorter = new Sorting();
        ArrayList<Integer> unsorted = sorter.getArray();
        //Prints in brackets:
        System.out.println(unsorted);

        //For Each: print out the contents of the array:
        /* for(int x: unsorted){
            //Prints out everything in the 'x'.
            System.out.println(x);
        }
         */

        //Using the object to call the sorting array method:
        //--must pass through the unsorted array list
        ArrayList<Integer> sorted  = sorter.sortArray((ArrayList)unsorted.clone());
        //Prints in brackets:
        System.out.println(sorted);

        /* for(int x: sorted){
            System.out.println(x);
        }
         */
    }

}
