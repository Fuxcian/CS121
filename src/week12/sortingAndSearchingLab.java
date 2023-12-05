package week12;

public class sortingAndSearchingLab {
    //Insertion Sort
    /* Beneficial is you want to test and sort out a smaller data set.
     * As list grows its time complexity gets worse.
     */
    public void insertionSort(int[] array){
        int temp; //temporary variable for swapping elements
        /* loop through array starting at the second index [1]
         * assuming [0] is already sorted
         */
        for(int i = 1; i < array.length; i++){
            /* loop while j > 0 (could use a while loop instead of for)
             * decrement j each loop
             */
            for(int j = 1; j > 0; j--){
                //check if element is less than the preceding element
                if(array[j] < array[j - 1]){
                    //if less, swap
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
    //Selection Sort
    /* Finds minimum element within an array.
     * It references two elements and keeps swapping until it reaches correct values.
     * Only ascending.
     */
    /* Not the best for a larger data set.
     * Better time complexity than insertion.
     */
    public void selectionSort(int[] array){
        //loop to move boundary of unsorted array
        for(int i = 0; i < array.length - 1; i++){
            //assume element at first index [i] is the minimum or lowest value
            int min = i;
            /* loop through unsorted array
             * start with j at i + 1 so we can compare, in first loop, [0] with [1]... etc...
             */
            for(int j = i + 1; j < array.length; j++){
                //see if element at index j is less than minimum
                if(array[j] < array[min]){
                    //if it is, we set minimum value to that index number
                    min = j;
                }
            }
            /* swap the element at the minimum with the
             * element at the beginning of ths unsorted array
             */
            int temp = array[1];
            array[i] = array[min];
            array[min] = temp;
        }
    }
    private static int partition(int[] array, int left, int right){
        int i = left;
        int j = right;
        int temp;
        int pivot = array[(left + right)/2]; //pivot is middle index element
        System.out.printf("pivot: %d%n", pivot);
        while(i <= j){
            while(array[i] < pivot){
                i++;
            }
            while(array[j] > pivot){
                j--;
            }
            if(i <= j){
                /* Swap elements at indices i and j if true
                 */
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                System.out.printf("Swap %d and %d%n", array[i],array[j]);
                i++;  //move i to next position
                j++;  //move j to next position
            } else {
                System.out.println("no swap");
            }
            for(int num : array){
                System.out.println(num + " ");
            }
            System.out.println();
        }
        return i;
    }
    private static void quickSort(int[] array, int left, int right){
        int i = partition(array, left, right); //call partition method to divide the array.
        if(left < i -1){
            quickSort(array, left, i - 1); //call quicksort recursively
        }
        if(i < right){
            quickSort(array, i, right); //call quicksort recursively
        }
    }
}