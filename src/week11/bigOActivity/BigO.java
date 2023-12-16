package week11.bigOActivity;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BigO {
    //Variables:
    String[] sharkTypes = {"Hammerhead", "Mako", "Great White", "Tiger Shark", "Goblin Shark",
            "Blue Shark", "Bull Shark", "Oceanic Whiptail Shark" };

    //Runs in O(1) time: printOnce()
    /* Parameter of String.
     * Prints parameter value:
     */
    public void printOnce(String[] sharkTypes){
        //Don't forget '[]'.
        //Turns it into string.
        System.out.println(Arrays.toString(sharkTypes));
    }

    //Runs in O(n) time: printNTimes()
    /* Parameter of int n.
     * Prints phrase n number of times:
     */
    public void printNTimes(int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.printf("n = %d, so this prints %d times%n", n, n);
        }
    }

    //Runs in O(n^2) time: printNSquaredTimes()
    /* Parameter of int n.
     * Print a phrase n^2 number of times:
     */
    public void printAllPossibleOrderedPairs(Object array) {
        int counter = 1;
        for (int i = 0; i < Array.getLength(array); i++) {
            for (int j = i; j < Array.getLength(array); j++) {
                System.out.println(counter + ". " + Array.get(array, i) + ", "
                        + Array.get(array, j));
                counter++;
            }
        }
    }

    public String[] getSharkTypes() {
        return sharkTypes;
    }
}
