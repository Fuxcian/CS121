package week6.overLoaded;

public class dndClass {
    private String mainClass;
    private String subclass;
    private int hitDice;
    private int level;

    //constructor: no parameters -- default
    public dndClass(){
    }
    //constructor: one parameter
    public dndClass(String mainClass){
        this.mainClass = mainClass;
    }
    //constructor: three+ parameters
    public dndClass(String mainClass, String subclass, int hitDice, int level){
        this.mainClass = mainClass;
        this.subclass = subclass;
        this.hitDice = hitDice;
        this.level = level;
    }
    //Getter Methods:
    public String getMainClass(){
        return mainClass;
    }
    public String getSubclass(){
        return subclass;
    }
    //Overloaded Methods:
    public int getHitDice(){
        return hitDice;
    }
    public void setHitDice(int newHitDice){
        hitDice = newHitDice;
    }
    public void setHitDice(int newHitDice, int level){
        if(level > 1){
            hitDice = newHitDice * level;
        }
    }
    public int getLevel(){
        return level;
    }
}
