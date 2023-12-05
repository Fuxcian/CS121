package week6;

public class Character {
    private String name;
    private int health;
    private int attackPoints;
    private int strength;

    //constructor with no parameters-- default
    public Character(){
    }

    //constructor with only name for parameter-- health and attack points set with setters
    public Character(String charName){
        this.name = charName;
    }

    //constructor with 3 parameters
    public Character(String charName, int charHealth, int charAttackPoints, int charStrength){
        this.name = charName;
        this.health = charHealth;
        this.attackPoints = charAttackPoints;
        this.strength = charStrength;
    }

    public int getHealth(){
        return health;
    }
    public void setHealth(int newHealth){
        health = newHealth;
    }
    public void setHealth(int newHealth, int strength){
        if(strength > 10){
            health = newHealth + 5;
        }
    }
    public int getStrength(){
        return strength;
    }
    public void setStrength(int strength){
        this.strength = strength;
    }
}
