package week6.overLoaded;

public class Main {
    public static void main(String[] args){
        dndClass class1 = new dndClass();
        dndClass class2 = new dndClass("Monk");
        dndClass class3 = new dndClass("Wizard", "Order of Scribes",6, 14);

        System.out.printf("The default hit dice of your class is a %d-sided die\n", class3.getHitDice());
        class3.setHitDice(8);
        System.out.printf("With the your constitution score added, the total hit dice per level is: %d\n", class3.getHitDice());
        class3.setHitDice(8,class3.getLevel());
        System.out.printf("The maximum possible health for your hit dice is %d\n",class3.getHitDice());
    }
}
