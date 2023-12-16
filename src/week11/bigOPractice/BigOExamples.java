package week11.bigOPractice;

import java.lang.reflect.Array;

public class BigOExamples {
    /* Since there's not an exact number for the runtime,
     * the size of the input 'n' is used to express runtime growth.
     * O(n)-->
     */
    char[] character = {'A'};

    String[] biggestMovies2016 = {"Rogue One", "Finding Dory",
            "Captain America: Civil War", "The Secret Life of Pets", "The Jungle Book",
            "Deadpool", "Zootopia", "Batman v Superman", "Suicide Squad", "Sing"};
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    public void printFirstItem(){
        System.out.println("Runs in O(1) time or Constant Time\n"
        + "No matter how big the input, still requires only one step");
        System.out.println(character[0]);
        System.out.println(biggestMovies2016[0]);
        System.out.println(numbers[0]);
    }

    //Use (Object Array) for parameter so an array of any type can be passed.
    public void printAllItems(Object array){
        System.out.printf("%nRuns in O(n) time or Linear Time, %n"
                + "where n is the number of items in the array. %n" +
                "If we print all the items, we will print n times. %n");
        //Use generic Array class and method it unsure what type of array.
        System.out.printf("%nIf n = %d, we print %d times: %n%n",
                Array.getLength(array), Array.getLength(array));
        for(int i = 0; i < Array.getLength(array); i++){
            //Use Array method get(array, 3): array is passed in, i is index)
            System.out.println(Array.get(array, i));
        }
    }
    public void printAllPossibleOrderedPairs(Object array) {
        System.out.printf("Runs in O(n^2) time or Quadratic Time, %n" +
                "where outer loop runs n times and %n" +
                "inner loop runs n times for each iteration of outer loop," +
                "%n which prints n^2 times in total\n.");
        int counter = 1;
        for (int i = 0; i < Array.getLength(array); i++) {
            for (int j = 0; j < Array.getLength(array); j++) {
                System.out.println(counter + ". " + Array.get(array, i) + ", "
                        + Array.get(array, j));
                counter++;
            }
        }
        System.out.println();

        /* n can be the actual input or the size of the input.
         * Both of the following methods have o(n) runtime,
         * even though one takes an integer as input and one takes an array;
         */
    }

        //RUNTIME FAIL:
        public void printNTimes(int n)
        {
            for (int i = 0; i < n; i++)
            {
                System.out.printf("n = %d, so this prints %d times%n", n, n);
            }
        }
        public void printAllElements(String[] array){
            for (String item : array) {
                //System.out.println(item);
                System.err.println(item);
            }
        }


}