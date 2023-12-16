package week10.ArrayListsandJumpsActivity;

import week10.ArrayListsandJumpsActivity.StringArrayList;

public class StringArrayListTest {
    public static void main(String[] args) {

        StringArrayList cakesDemo = new StringArrayList();

        cakesDemo.addCakes("Chocolate");
        cakesDemo.addCakes("Strawberry");
        cakesDemo.addCakes("Vanilla");
        cakesDemo.addCakes("Red Velvet");

        System.out.printf("The cake list contains %d flavors.%n", cakesDemo.getSizeOfCakesList());
        cakesDemo.displayCakes();

        System.out.printf("%nWe can remove last, more unpopular, cake: %s%n", cakesDemo.getCake(3));
        cakesDemo.removeCakes("Red Velvet");

        System.out.printf("%nThe cake list is now %d flavors.", cakesDemo.getSizeOfCakesList());
        cakesDemo.displayCakes2();
    }
}
