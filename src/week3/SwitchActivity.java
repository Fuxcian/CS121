package week3;

import javax.swing.*;

public class SwitchActivity {
    public static void main(String[] args){

        //PLANETS
        //Display prompt to user to enter a planet.
        String planet = JOptionPane.showInputDialog(null, "Enter a planet");
        //Initialize planetInfo as an empty string.
        String planetInfo = "";
        switch(planet){
            case "mercury":
                planetInfo = "This planet is 28.88 million mi^2 in size and 35,000,000 mi from the sun.";
                break;
            case "venus":
                planetInfo = "This planet is 177.7 million mi^2 in size and 67,000,000 mi from the sun.";
                break;
            case "earth":
                planetInfo = "This planet is 196.9 million mi^2 in size and 93,000,000 mi from the sun.";
                break;
            case "mars":
                planetInfo = "This planet is 55.74 million mi^2 in size and 142,000,000 mi from the sun.";
                break;
            case "jupiter":
                planetInfo = "This planet is 23.71 billion mi^2 in size and 484,000,000 mi from the sun.";
                break;
            case "saturn":
                planetInfo = "This planet is 16.49 billion mi^2 in size and 889,000,000 mi from the sun.";
                break;
            case "uranus":
                planetInfo = "This planet is 3.121 billion mi^2 in size and 1,790,000,000 mi from the sun.";
                break;
            case "neptune":
                planetInfo = "This planet is 2.941 billion mi^2 in size and 2,880,000,000 mi from the sun.";
                break;
            case "pluto":
                planetInfo = "This 'planet' is 1,473 mi in size and 3,670,000,000 mi from the sun.";
                break;
            default:
                planetInfo = "There is no information on this planet.";
                break;
        }
    }
}
