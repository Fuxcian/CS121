package projectTwo;


public class Main {
    public static void main(String[] args){
        //Initialize Objects:
        characterStat Nert = new characterStat("Nert", "Humanoid", "Kobold", 5, "Artificer", "Artillerist");
        monsterStat Dragon = new monsterStat("Arveiaturace", "Dragon", "White Dragon", 20);

        //ArrayList:
        Dragon.addLegendary("\nDetect: The dragon makes a Wisdom (Perception) check.");
        Dragon.addLegendary("Tail Attack: The dragon makes a tail attack.");
        Dragon.addLegendary("Wing Attack (Costs 2 Actions): The dragon beats its wings. Each creature within 10 feet of the dragon must succeed\non a DC 19 Dexterity saving throw or take 13 (2d6 + 6) " +
                "\nbludgeoning damage and be knocked prone. The dragon can then fly" +
                "\nup to half its flying speed.\n");
        Dragon.displayLegendary();


        //Get Names
        Nert.getCreatureName();
        Dragon.getCreatureName();

        //PROCESSING AND OUTPUT: Output:
        Nert.characterCR(Nert.getLevel());
        Dragon.monsterLevel(Dragon.getCR());

        //BRIEF DESCRIPTION:
        /* A choice in data structure I used was ArrayLists.
         * I did this because it is a quick and easy way to withdraw
         * information that does not require much order, and I don't need
         * to augment the middle in any sense. It can also support a growing list
         * and is able to be held within character specific ArrayLists.
         */
    }

    //EXTRA CREDIT:
    /* The application Main (statBlock, characterStat, monsterStat) uses classes and subclasses (ha-ha just liked dnd)
     * in order to create one basic class/"sheet" of details (statBlock) that is transferred over to child classes,
     * which modify the data appropriately to it's own needs. Such as the child-class characterStat using the levels variable
     * which is unique to the child class. The program also calculates a conversion between character specific level and monster specific CR.
     * Within the application as well is an ArrayList of monster-specific legendary attacks that are attached to created monsters, such as the dragon.
     * The program with modification can also display the variables of the objects with getters and setters.
     */
}
