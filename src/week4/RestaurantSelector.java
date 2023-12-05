package week4;

import java.util.Scanner;

public class RestaurantSelector {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        //Prompt user
        System.out.println("Is anyone in your party vegetarian? ");
        String vegetarian = console.nextLine().toLowerCase();
        System.out.println("Is anyone in your party vegan? ");
        String vegan = console.nextLine().toLowerCase();
        System.out.println("Is anyone in your party gluten-free? ");
        String gluten = console.nextLine().toLowerCase();

        if(vegetarian.equals("no") && vegan.equals("no") && gluten.equals("no") ) {
            System.out.println("Joe's Gourmet Burgers");
        }
        if(vegetarian.equals("yes") && vegan.equals("no") && gluten.equals("yes")){
            System.out.println("Main Street Pizza Co.");
        }
        if(vegetarian.equals("yes") && vegan.equals("yes") && gluten.equals("no")){
            System.out.println("Corner Cafe");
        }
        if(vegetarian.equals("yes") && vegan.equals("no") && gluten.equals("no")){
            System.out.println("Mama's Fine Italian");
        }
        if(vegetarian.equals("yes") && vegan.equals("yes") && gluten.equals("yes")){
            System.out.println("The Chef's Kitchen");
        }
    }
}
