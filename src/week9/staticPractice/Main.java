package week9.staticPractice;

public class Main {
    public static void main(String [] args){
        Enemy troll = new Enemy("Troll", 15, 30);
        Enemy goblin = new Enemy("Goblin", 20, 20);
        /* Produces '1' because each instance is unique.
         * To produce '2', we must make a static/class variable,
         * it will be a shared copy between the instances in the class.
         */
        //Changing to 'Enemy.getEnemy'
        System.out.printf("Troll enemy count: %d%n", Enemy.getEnemyCount());
        System.out.printf("Goblin enemy count: %d%n", Enemy.getEnemyCount());
        System.out.printf("Enemy count: %d%n", Enemy.getEnemyCount());
    }
}
