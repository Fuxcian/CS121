package week6.classActivity;

public class Player {
    //3-4 instance variables
    String name;
    String username;
    int level;
    int xp;

    //a constructor
    public Player(String name, String username, int level){
        this.name = name;
        this.username = username;
        this.level = level;
    }
    //one method
    void playerInfo(){
        xp = level*100;
        System.out.printf("The player's name is: %s%nThe player's name online is: %s%nTheir level is: %d%n" +
                "They need %d to advance next level %n",  name, username, level, xp);

    }
}
