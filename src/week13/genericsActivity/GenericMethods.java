package week13.genericsActivity;

public class GenericMethods {
    public <E> void printArrayList(E[] Arraylist) {
        for(E element : Arraylist) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
