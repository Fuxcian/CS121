package week13.genericsActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        GenericMethods generic = new GenericMethods();
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'A', 'B', 'C', 'D', 'E'};
        String[] stringArray = {"Alpha", "Beta", "Gamma", "Delta", "Epsilon"};

        //Example of how to use asList() within the code:
        ArrayList <String> StringArrayList = new ArrayList<>(Arrays.asList("example", "prototype", "sample", "specimen"));

        System.out.println("Integer arraylist: ");
        generic.printArrayList(intArray);

        System.out.println("Double arraylist: ");
        generic.printArrayList(doubleArray);

        System.out.println("Char arraylist: ");
        generic.printArrayList(charArray);

        System.out.println("String arraylist: ");
        generic.printArrayList(stringArray);

        System.out.println("Empty arraylist: ");
    }
}
