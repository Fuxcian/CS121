package week11.bigOActivity;

public class Test {
    public static void main(String[] args){
        //NOTES:
        /* How to Get Variables:
         * (Inside Class) String[] getSharkTypes() {return array};
         * (Only When Public) example.sharkTypes
         */
        BigO example = new BigO();
        /*
         * O(1) method
         */
        example.printOnce(example.getSharkTypes());

        /*
         * O(n)
         */
        example.printNTimes(4);

        /*
         * O(n^2)
         */
        example.printAllPossibleOrderedPairs(example.getSharkTypes());
    }
}
