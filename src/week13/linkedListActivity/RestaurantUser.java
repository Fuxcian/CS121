package week13.linkedListActivity;

import java.util.LinkedList;

public class RestaurantUser {
    //Instance Variables:
    private String userName;
    private String reservationDate;
    private int numberOfGuests;
    private int tableNumber;
    private String menuSelection;
    private int orderNumber;
    private LinkedList<Integer> tableList;

    //Constructor:
    public RestaurantUser(String userName, String reservationDate, int numberOfGuests, int tableNumber, String menuSelection, int orderNumber) {
        this.userName = userName;
        this.reservationDate = reservationDate;
        this.numberOfGuests = numberOfGuests;
        this.tableNumber = tableNumber;
        this.menuSelection = menuSelection;
        this.orderNumber = orderNumber;
        this.tableList = new LinkedList<>();
    }

    //Methods:
    public void addTableReservation(int table){
        tableList.add(table);
    }
    public void removeTableReservation(int table){
        tableList.remove(table);
    }
    public String getUserInfo(){
        return "User: " +userName+ "\nReservation Date: " +reservationDate+ "\nNumber of Guest: "
                +numberOfGuests+ "\nOrder Number: " +orderNumber;
    }
    public void displayUserBookings(){
        System.out.println("User: " +userName+ "\nTable Reservation: " +tableList+ "\n");
    }
}