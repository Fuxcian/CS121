package week6.classActivity;

public class PlayerTest {
    public static void main(String[] args){
        Player player1 = new Player("Laney","Fuxcian",10);
        Player player2 = new Player("Joseph","Jodagon", 14);
        Player player3 = new Player("Logan","LoafArchon",15);

        player1.playerInfo();
        player2.playerInfo();
        player3.playerInfo();

        System.out.println();
    }
}