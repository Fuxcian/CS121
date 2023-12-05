package week13.hashMapsPractice;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args){
        HashMap<String, String> capitalMaps = new HashMap<>();

        capitalMaps.put("France", "Paris");
        capitalMaps.put("China", "Beijing");
        capitalMaps.put("Australia", "Canberra");
        //use the forEach() method to loop through
        //the HashMap to get each k,v (key, value) pair
        capitalMaps.forEach((key, value) -> {       //what??
            System.out.printf("Country: %s - Capital: %s\n", key, value);
        });     //also what?

        System.out.printf("The size of the HashMap is %d\n", capitalMaps.size());
        System.out.printf("France is in the HashMap: %b\n", capitalMaps.containsKey("France"));
        System.out.printf("Paris is in the HashMap: %b\n", capitalMaps.containsValue("Paris"));
        System.out.printf("The capital of France is %s\n", capitalMaps.get("France"));
        capitalMaps.remove("France");
        System.out.printf("Trying to get the value of a removed key now returns: %s\n",
                capitalMaps.get("France"));
    }
}
