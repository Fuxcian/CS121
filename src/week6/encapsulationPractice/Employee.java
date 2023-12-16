package week6.encapsulationPractice;

public class Employee {

    //instance variables
    private String name;
    private String id;
    private double salary;
    private double bonus;
    private double raise;
    private double totalPay;

    //constructor
    public Employee(String name, String id, double salary, double bonus, double raise){
        this.name = name;
        this.id = id;
        this.bonus = bonus;
        this.raise = raise;
    }
    //method to calculate total pay
    public double calculateTotalPay(){
        totalPay = salary + bonus;
        return totalPay;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
