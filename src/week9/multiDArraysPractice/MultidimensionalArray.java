package week9.multiDArraysPractice;

public class MultidimensionalArray {
    //Basic Syntax: type[][] outerArray = { {innerArray1}, {innerArray2} }
    public static void main(String[] args){
        int[][] array1 = {{1,2,3},
                          {4,5,6}};
        int[][] array2 = {{1,2},
                {3},
                {4,5,6}};

        //for each
        for(int[] row: array2){
            for(int column:row){
                System.out.printf("%d ", column);
            }
            System.out.println();
        }
        System.out.println();
        for(int[] row : array2){
            for(int column : row){
                System.out.printf("%d ", column);
            }
            System.out.println();
        }
        for(int row = 0; row < array1.length; row++){
            for(int column = 0; column < array1[row].length; column++){
                System.out.printf("%d", array1[row][column]);
            }
            System.out.println();
        }

        int[][] array3 = new int[2][3];
        array3[0][0] = 1;
        array3[0][1] = 2;
        array3[0][2] = 3;
        array3[1][0] = 4;
        array3[1][1] = 5;
        array3[1][2] = 6;
    }
}
