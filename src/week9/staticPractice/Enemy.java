package week9.staticPractice;

public class Enemy {
    private String name;
    private int health;
    private int strength;
    /* Adding the 'keyword' 'static' to tell
     * the computer that this will be a shared variable.
     */
    private static int enemyCount;

    public Enemy(String name, int health, int strength){
        this.name = name;
        this.health = health;
        this.strength = strength;
        //Removing 'this' because it no longer matters.
        enemyCount++;
    }
    //Adding 'static' to this get statement to be specific.
    public static int getEnemyCount(){
        return enemyCount;
    }
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public int getStrength(){
        return strength;
    }
}
