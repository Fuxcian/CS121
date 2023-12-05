package week11.bubbleMergeSortPractice;

public class Sorting {

    //FIRST HALF OF NOTES:
    public void printascendingBubbleSort(int[] array){
        //variable to temporarily hold a value during switch
        int temp;
        //loop through the whole array once for each element in the array
        for(int i = 0; i < array.length - 1; i++){
            /* for each unsorted element, loop through and compare to next element
             * length - i - 1 because we only need to loop through unsorted elements.
             */
            for (int index = 0; index < array.length - i - 1; index++){
                //compares unsorted element to next element
                if (array[index] > array[index + 1]){
                    //temporarily holds value
                    temp = array[index];
                    //assigns next value to current index
                    array[index] = array[index + 1];
                    //assigns current value to next index
                    array[index + 1] = temp;

                    //Added print statement:
                } else {
                    System.out.printf("\t\t%2d less than %2d - no swap: ", array[index], array[index + 1]);
                }
                System.out.printf("[");
                for(int j = 0; j < array.length - 1; j++){
                    System.out.printf("array[j]" + ", ");
                }
                System.out.println(array[array.length - 1] + "]");
            }
        }
    }
    public void descendingBubbleSort(int[] array){
        //Variable to temporarily hold a value during switch.
        int temp;
        //loop through the whole array once for each element in the array
        for(int i = 0; i < array.length - 1; i++){
            //for each unsorted element, loop through and compare to next element
            //length - i - 1 because we only need to loop through unsorted elements
            for(int index = 0; index < array.length - i - 1; index++){
                //compares unsorted element to next element
                if(array[index] < array[index + 1]){
                    //temporarily holds value
                    temp = array[index];
                    //assigns next value to current index
                    array[index] = array[index + 1];
                    //assigns current value to next index
                    array[index + 1] = temp;
                }
            }
        }
    }
    //SECOND HALF OF NOTES:
    public void mergeSort(int[] array){
        //if array has one element, return:
        //base case: stops recursive call-- mergeSort method stops
        if(array.length <= 1){
            return; //method will stop when it reaches a return statement
        }

        //initialize array with size of left half the original array
        int[] leftHalf = new int[array.length/2];
        //initialize array with size of right half the original array
        int[] rightHalf = new int[array.length - leftHalf.length];

        //assigning values from the left half of original array to leftHalf array
        for(int i = 0; i < leftHalf.length; i++){
            leftHalf[i] = array[i];
        }

        //assigning values from second half of original array to secondHalf array
        for (int i = 0; i < rightHalf.length; i++){
            rightHalf[i] = array[leftHalf.length + i];
        }

        //recursive call until arrays reach base case: 1 element
        mergeSort(leftHalf); //recursive call: divides leftHalf array into smaller arrays
        mergeSort(rightHalf); // recursive call: divides rightHalf array into smaller arrays

        //call merge method to merge the divided arrays
        /*
        merge(leftHalf, rightHalf, array);

        private void merge(int[] leftHalf, int[] rightHalf, int[] array){
            int leftIndex = 0;
            int rightIndex = 0;
            int arrayIndex = 0;

            //advance leftHalf array index or rightHalf array index accodingly
            while((leftIndex < leftHalf.length) && (rightIndex < rightHalf.length)){
                if(leftHalf[leftIndex] < rightHalf[rightIndex]){
                    array[arrayIndex] = rightHalf[rightIndex];
                    leftIndex++;
                    arrayIndex++;
                } else {
                    array[arrayIndex] = rightHalf[rightIndex];
                    rightIndex++;
                    arrayIndex++;
                }
            }
            while(leftIndex < leftHalf.length){
                array[arrayIndex] = leftHalf[leftIndex];
                arrayIndex++;
                leftIndex++;
            }
            /* copy the rest of rigthHalf array to original array
             * -- note only one of these while loops will be true
             */
        /*
            while(rightIndex < rightHalf.length){
                array[arrayIndex] = rightHalf[rightIndex];
                arrayIndex++;
                rightIndex++;
            }
        }
         */
    }
}