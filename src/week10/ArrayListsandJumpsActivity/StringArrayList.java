package week10.ArrayListsandJumpsActivity;

import java.util.ArrayList;

public class StringArrayList {
    //Create an instance of the string:
    ArrayList<String> cakes = new ArrayList<String>();
    public void addCakes(String cake){
        cakes.add(cake);
    }
    public void removeCakes(String cake){
        cakes.remove(cake);
    }
    //This grabs and shows a number, therefore it's an int:
    public int getSizeOfCakesList(){
        return cakes.size();
    }
    public String getCake(int index){
        return cakes.get(index);
    }
    //For Each:
    public void displayCakes(){
        System.out.print("Cakes:\n");
        for(Object cake : cakes){
            System.out.printf("%s%n", cake);
        }
    }
    //Standard For:
    public void displayCakes2(){
        System.out.print("\nCakes:\n");
        for(int i = 0; i < cakes.size(); i++){
            System.out.printf("%s%n", cakes.get(i));
        }
    }
}
