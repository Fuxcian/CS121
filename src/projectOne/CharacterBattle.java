package projectOne;

import javax.swing.*;
import java.util.Scanner;
import java.util.Random;

public class CharacterBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //SCORE TALLY:
        int PlayerOnePoints = 0;
        int PlayerTwoPoints = 0;


        //ROUND SET:
        int rounds = Integer.parseInt(JOptionPane.showInputDialog("Please enter an odd number of rounds"));
        for (int i = 1; i <= rounds; i++) {
            //STAT SET:
            String name = JOptionPane.showInputDialog("Enter new character name, Player One");
            String name2 = JOptionPane.showInputDialog("Enter new character name, Player Two");

            int hp = Integer.parseInt(JOptionPane.showInputDialog("Enter a number of hit points, Player One."));
            int hp2 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number of hit points, Player Two."));

            String specialMove = JOptionPane.showInputDialog("What's your move's attack name, Player One?");
            String specialMove2 = JOptionPane.showInputDialog("What's your move's attack name, Player Two?");

            int movePower = Integer.parseInt(JOptionPane.showInputDialog("What's your move's attack power, Player One?"));
            int movePower2 = Integer.parseInt(JOptionPane.showInputDialog("What's your move's attack power, Player Two?"));

            int moveSpeed = Integer.parseInt(JOptionPane.showInputDialog("What is the speed of this move, Player One?"));
            int moveSpeed2 = Integer.parseInt(JOptionPane.showInputDialog("What is the speed of this move, Player Two?"));

            //PLAYER ONE WAS FASTER:
            if (moveSpeed > movePower2) {
                hp2 = hp2 - movePower;
                if (hp2 <= 0) {
                    System.out.println("Player One wins!");
                    PlayerOnePoints = PlayerOnePoints + 1;
                    break;
                } else {
                    hp = hp - movePower2;
                    if (hp <= 0) {
                        System.out.println("Player Two wins!");
                        PlayerTwoPoints = PlayerTwoPoints + 1;
                        break;
                    }
                }

            }
            //PLAYER 2 WAS FASTER:
            if (moveSpeed < movePower2) {
                hp = hp - movePower2;
                if (hp <= 0) {
                    System.out.println("Player Two wins!");
                    PlayerTwoPoints = PlayerTwoPoints + 1;
                    break;
                } else {
                    hp2 = hp2 - movePower;
                    if (hp2 <= 0) {
                        System.out.println("Player One wins!");
                        PlayerOnePoints = PlayerOnePoints + 1;
                        break;
                    }
                }
            }

            //PLAYER ONE AND TWO TIE:
            if (moveSpeed == moveSpeed2) {
                int value = (int) Math.random() * (2 - 1) + 1;
                /* If even, Player One goes first;
                 * if odd, Player Two goes first.
                 */
                if (value % 2 == 0) {
                    hp2 = hp2 - movePower;
                    if (hp2 <= 0) {
                        System.out.println("Player One wins!");
                        PlayerOnePoints = PlayerOnePoints + 1;
                        break;
                    } else {
                        hp = hp - movePower2;
                        if (hp <= 0) {
                            System.out.println("Player Two wins!");
                            PlayerTwoPoints = PlayerTwoPoints + 1;
                            break;
                        }
                    }
                } else {
                    hp = hp - movePower2;
                    if (hp <= 0) {
                        System.out.println("Player Two wins!");
                        PlayerTwoPoints = PlayerTwoPoints + 1;
                        break;
                    } else {
                        hp2 = hp2 - movePower;
                        if (hp2 <= 0) {
                            System.out.println("Player One wins!");
                            PlayerOnePoints = PlayerOnePoints + 1;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("Player One's final score is: " +PlayerOnePoints+
                "\nPlayer Two's final score is: " +PlayerTwoPoints);
    }
}