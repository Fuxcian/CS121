package week4.loopActivities;

import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int rooms = 0;
        int occupied = 0;

        System.out.println("How many floors are in this hotel?");
        //Why did only 'num' only work
        int floors = Integer.parseInt(console.nextLine());

        for(int i = 1; i <= floors ; i++) {
            System.out.println("How many rooms are on floor " +i+ "?");
            rooms += Integer.parseInt(console.nextLine());
            System.out.println("How many rooms are occupied on floor " +i+ "?");
            occupied += Integer.parseInt(console.nextLine());
        }
        double ocrate = (((double)occupied)/rooms)*100;
        //Having trouble with percentage, ask.

        System.out.println("The occupancy rate of this hotel is " +ocrate+ ".");

        System.out.println("There are " +floors+ " total floors.");
        System.out.println("There are " +rooms+ " total rooms.");
        System.out.println("There are " +occupied+ " total occupied rooms.");

        int vacant = rooms - occupied;
        System.out.println("There are " +vacant+ " vacant rooms available.");
    }
}
