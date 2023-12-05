package week9.multiDArraysPractice;

public class ForEach {
    public static void main(String[] args) {

        String[] names = {"Mary", "Tom", "John", "Jane", "Lisa"};
        for (String name: names){
            System.out.printf("%s%n", name);
        }

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;
        for(int number: numbers){
            total += number;
        }
        System.out.printf("The total of the array of elements is: %d%n", total);

        //Multidimensional Array (list within list) --> String [][]
        /* To access certain parts of list, implement # associated with its placement.
         * Numbers associated with placement function like 2D plane
         */

        /* "for each" for loop.
         * for(parameter : arrayName){
         *      statement
         * }
         */

        /* for(int i = 0; i < names.length; 1++){
         * for(int j = 0; j < names [i].length; i++)
         *  sout(names [i][j]);
         * }
         * for (String[] row: names){
         *  for (String name : row){
         *   sout(name + " ")
         *  }
         * }
         */
    }

}
