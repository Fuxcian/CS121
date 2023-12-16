//Class #3

package projectTwo;

import java.util.ArrayList;

public class monsterStat extends statBlock {
    //Monster Specific Stats:
    private int CR;
    ArrayList<String> legedaryActions = new ArrayList<>();


    //DATA STRUCTURE & OBJECTS: ArrayList Items:
    public void addLegendary(String action){
        legedaryActions.add(action);
    }
    public void removeLegendary(String action){
        legedaryActions.remove(action);
    }
    public void displayLegendary(String action){
        System.out.println(legedaryActions);
    }


    //ENCAPSULATION:
    //Initialize:
    public monsterStat(String name, String type, String race, int CR) {
        super(name, type, race);
        this.CR = CR;
    }

    //Setters and Getters:
    public int getCR() {
        return CR;
    }
    public void setCR(int CR) {
        this.CR = CR;
    }


    public String getLegendary(int index){
        return legedaryActions.get(index);
    }
    public int getSizeOfLegendary(){
        return legedaryActions.size();
    }
    public void displayLegendary(){
        System.out.printf("All Legendary Actions: %n");
        for(Object action : legedaryActions){
            System.out.printf("%s%n", action);
        }
    }


    //PROCESSING & OUTPUT: Processing Data:
    //Overrides:
    @Override
    public void characterCR(int level) {
    }
    @Override
    public void monsterLevel(int CR){
        int level = (int) (CR * 1.3);
        System.out.println("The hypothetical level for this DM monster" +
                "is 130% of the total CR: " + level);
    }
}
