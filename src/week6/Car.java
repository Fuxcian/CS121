package week6;
import javax.swing.*;

//Object-oriented programming(OOP)
//Class: Blueprint or template that defines the structure and behavior of objects.
/* Encapsulation --> Important OOP principle
 * The primary purpose is to hide the internal implementation
 * detail of a class and provide; a form of controlled access to the data through methods.
 * To maintain data integrity, security and the ability to change
 * the implementation without affecting external code
 * EX: Capsule.
 */
public class Car {
    //Instance variables/fields/member variables (Also known as fields or attributes)
    //"State" --> data attributes that describe the current properties of an object.
    protected String model, make, color;
    private int seats, miles, years;
    //package-private --> default
    boolean isElectric;

    //Constructor
    //Name, no return type, default or initialized, overloading, default constructor
    //default constructor --> take no parameters.

    public Car() {
        //this keyword
    }

    //Parametrized constructor
    /* Overloading constructors:
     * (MUST) ---- Same Name, different parameter lists
     * (CAN) ---- Different access modifiers.
     */
    //Without Years, Electric, Miles, Seats, Color and Make
    public Car(String Model) {
        //this keyword
        this.model = Model;
    }

    public Car(String Model, int years, boolean isElectric) {
        //this keyboard
        this.model = Model;
        this.years = years;
        this.isElectric = isElectric;
    }

    //Without Years, Electric, Miles, Seats and Color
    public Car(String Model, String Make) {
        //this keyword
        this.model = Model;
        this.make = Make;
    }

    //Without Years, Electric, Miles and Seats
    public Car(String Model, String Make, String Color) {
        //this keyword
        this.model = Model;
        this.make = Make;
        this.color = Color;
    }

    //Without Years, Electric and Miles
    public Car(String Model, String Make, String Color, int Seats) {
        //this keyword
        this.model = Model;
        this.make = Make;
        this.color = Color;
        this.seats = Seats;
    }

    //Without Years and Electric
    public Car(String Model, String Make, String Color, int Seats, int Miles) {
        //this keyword
        this.model = Model;
        this.make = Make;
        this.color = Color;
        this.seats = Seats;
        this.miles = Miles;
    }

    //Without Electric
    public Car(String Model, String Make, String Color, int Seats, int Miles, int Year) {
        //this keyword
        this.model = Model;
        this.make = Make;
        this.color = Color;
        this.seats = Seats;
        this.miles = Miles;
        this.years = Year;
    }

    //Without Make and Electric
    public Car(String Model, String Color, int Seats, int Miles, int Year) {
        //this keyword
        this.model = Model;
        this.color = Color;
        this.seats = Seats;
        this.miles = Miles;
        this.years = Year;
    }
    //With all parameters
    public Car(String Model, String Make, String Color, int Seats, int Miles, int Year, boolean Electric){
        //this keyword
        this.model = Model;
        this.make = Make;
        this.color = Color;
        this.seats = Seats;
        this.miles = Miles;
        this.years = Year;
        this.isElectric = Electric;
    }
    //Methods(functions) that operate on those variables.
    //"behaviors"
    //*****MUTATOR/ACCESSOR METHODS (SETTERS & GETTERS) Section*****
    /* GETTERS --> Accessors --> return the values of an instance variable.
     * SETTERS --> Mutators --> set the instance variables to whatever value is
     * passed in.
     * (mostly if instance variables/fields/member variables are private)
     */

    //*****GETTERS*****
    public int getYears() {
        return years;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public boolean getElectric() {
        return isElectric;
    }

    public int getMiles() {
        return miles;
    }

    //*****SETTERS*****
    public void setYears(int year) {
        this.years = year;
    }

    public void setElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    //OVERLOADING METHODS
    //EXAMPLES OF OVERLOADING A METHOD:
    /* public void setMiles(int miles)
     * VS
     * public void setMiles(int miles, boolean isElectric)
     * (MUST) --> Same Name, different parameter lists
     * (CAN) --> Different access modifiers, different return types.
     */
    public void setMiles(int miles) {
        if (!isElectric) {
            if (miles >= 0) {
                this.miles += miles;
                JOptionPane.showInputDialog(null, String.format("Your miles is" +
                        "currently: %d", this.miles));
            } else {
                JOptionPane.showMessageDialog(null, "Miles can't be negative.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "This car has an electric engine.");
        }
    }

    public void setMiles(int miles, boolean isElectric) {
        if(isElectric){
            this.miles = miles;
            JOptionPane.showMessageDialog(null, String.format("Your current miles are: %d%n", this.miles));
        } else {
            JOptionPane.showMessageDialog(null,"This car does not have an electric engine");
        }
    }
    /* If older car lets user print out a message about why the car is
     * better than new models.
     */
    public String honkIfOldCar(String message){
        if(years < 1980){
            System.out.println("Honk! This is an old car!\n");
            return message;
        } else {
            message = "This car is not old enough to honk!\nBeep!";
            return message;
        }
    }
    public void honkIfOldCar(){
        //if the year is < 1980
        if(years < 1980){
            System.out.println("Honk! Honk! This is an old car!");
        } else {
            System.out.println("This car is not old enough to honk!\nBeep!");
        }
    }
}
