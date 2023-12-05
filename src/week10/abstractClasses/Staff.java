package week10.abstractClasses;

import week10.interfaces.UserInteractable;

public class Staff extends User implements UserInteractable {
    /* Inherits user info.
     * position & shift time
     */
    private String shift;
    public Staff(String name, int password, String shift) {
        super(name, password);
        this.shift = shift;
    }

    @Override
    public void displayUserInfo() {
        System.out.printf("\nThis staff-member's name is: %s%nTheir store password is: %d%nTheir shift is: %s%n",
                getName(), getPassword(), shift);
    }

    @Override
    public void tableStatus() {
        System.out.println("\nThe table you are seating has requested your attention");
    }
    @Override
    public void checkMenu() {
        System.out.println("\nThere are no peanut-based allergens within the food" +
                "\nThere is one vegan item (Imitation Burger)\nBoth deserts are vegetarian (Cheesecake & Milkshake)");
    }
    @Override
    public void contactHelp() {
        System.out.println("The restaurant number is: (812)456-3030\nThe managerial email is: " +
                "SimonPetrikov@hotmail.com");
    }
}
