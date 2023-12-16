package week13.HashMapActivity;

import java.util.HashMap;
import java.util.Map;

public class DungeonsAndDragons {
    private Map<String, String> Class = new HashMap<>();

    public void addToClass(String mainClass, String subClass){
        Class.put(mainClass, subClass);
    }
    public void removeFromClass(String mainClass){
        Class.remove(mainClass);
    }

    public Object getSubClass(String mainClass) {
        Object sub;
        if (Class.containsKey(mainClass)) {
            sub = Class.get(mainClass);
        } else {
            sub = "Subclass not found.";
        }
        return sub;
    }
    public void displayClass() {
        Class.forEach((mainClass, subClass) -> {
            System.out.printf("Main Class: %s | Subclass: %s\n", mainClass, subClass);
        });

    }
}
