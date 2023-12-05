package week13.HashMapActivity;

public class Main {
    public static void main(String[] args){
        DungeonsAndDragons demo = new DungeonsAndDragons();

        /* This is the dnd main class/subclass thing I was talking
         * about :3
         */
        demo.addToClass("Ranger","Gloomstalker");
        demo.addToClass("Paladin","Oath of Redemption");
        demo.addToClass("Fighter","Battle Master");

        demo.displayClass();
        demo.removeFromClass("Fighter");
        System.out.println("-----------------");
        demo.displayClass();
    }
}
