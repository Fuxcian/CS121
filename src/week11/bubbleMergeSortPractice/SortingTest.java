package week11.bubbleMergeSortPractice;

public class SortingTest {
    public static void main(String[] args) {
        /* create an instance of the sorting class
         * so that we can run the public methods from it
         */
        Sorting sorter = new Sorting();

        int[] array = {30, 16, 24, 62, 25, 7};

        System.out.println("Unsorted: ");
        printArray(array);

        sorter.printascendingBubbleSort(array);
        System.out.print("Sorted ascending: ");
        printArray(array);

        System.out.println();

        /*
        sorter.descendingBubbleSort(array);
        System.out.print("Sorted descending: ");
        printArray(array);

        System.out.println();

        int[] array2 = {30, 16, 24, 62, 25, 7};
        sorter.printascendingBubbleSort(array2);
         */

        int[] array3 = {3, 6, 2, 9, 0, 13, 34, 23, 10, 32, 27};
        sorter.mergeSort(array3);
        printArray(array3);
    }

    /* Static method to print an array
     * static means we don't have to create and instance
     * of this class to call the method
     */
    public static void printArray(int[] array){
        for(int num: array){
            System.out.println(num + " ");
        }
        System.out.println();
    }
}
