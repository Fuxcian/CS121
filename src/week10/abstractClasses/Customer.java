package week10.abstractClasses;

import week10.interfaces.UserInteractable;

public class Customer extends User implements UserInteractable {
    /* Inherits user info.
     * orders or rewards
     */
    //variables:
    private int rewards;

    //Parameterized Constructor:
    public Customer(String name, int password, int rewards) {
        super(name, password);
        this.rewards = rewards;
    }

    //Implementing the abstract method:
    @Override
    public void displayUserInfo() {
        System.out.printf("\nThe Customer's name is: %s%nTheir password is: %d%nTheir rewards are: %d%n",
                getName(),getPassword(),rewards);
    }

    @Override
    public void tableStatus() {
        System.out.println("\nYour table will be ready in 15 minutes.");
    }

    @Override
    public void checkMenu() {
        System.out.println("\nThis menu features: \nAll American Burger, Imitation Burger" +
                "\nCoke, Dr. Pepper \nFries Cheesecake, Milkshake");
    }

    @Override
    public void contactHelp() {
        System.out.println("\nContact us at (812)456-3030 ");
    }
}