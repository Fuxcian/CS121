package week13.linkedListActivity;

public class Main {
    public static void main(String[] args){
        //Two Instances:
        RestaurantUser user1 = new RestaurantUser("Laney", "11-14-2023", 6, 3, "Vanilla Cream Cake", 92);
        RestaurantUser user2 = new RestaurantUser("Elisa", "12-23-2023", 4, 2, "Tres Leches", 5);

        //Table Reservations for User One:
        user1.addTableReservation(23);
        user1.addTableReservation(12);
        user1.addTableReservation(2);

        //Table Reservations for User Two:
        user2.addTableReservation(44);
        user2.addTableReservation(21);
        user2.addTableReservation(64);

        //Display User Information and Reservations:
        System.out.println("User 1 Info: \n" +user1.getUserInfo());
        user1.displayUserBookings();

        System.out.println("User 2 Info: \n" +user2.getUserInfo());
        user2.displayUserBookings();

        //Remove One Table:
        user1.removeTableReservation(2);

        //Updated Reservations:
        System.out.println("\nUpdated User 1 Info: \n" + user1.getUserInfo());
        user1.displayUserBookings();
    }
}