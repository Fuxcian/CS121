package week12.setsAndIterators;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class RestaurantSet {
    //Don't worry about main, allows set to be moveable:
    private Set<Integer> Tables = new HashSet<>();

    //Method to add any number of tables to set:
    public void addTables() {       //No static
        //Scanner Stuff:
        Scanner scanner = new Scanner(System.in);

        //Question and Loop:
        System.out.println("Please add any number of tables to the set," +
                " press '0' to quit.");
        int table = Integer.parseInt(scanner.nextLine());
        if (table == 0) {
            System.out.println("Program has ceased.");

        } else {
           Tables.add(table);
           addTables();
        }
    }
    public void displayTables(){        //No static
        Iterator<Integer> iterator = Tables.iterator();
        System.out.println("The number of tables within the restaurant");

        //while hasNext() is true, prints out the next table:
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
