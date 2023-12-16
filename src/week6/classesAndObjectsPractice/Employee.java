package week6.classesAndObjectsPractice;

public class Employee {
    //instance variables
    String name;
    String id;
    double salary;
    double bonus;
    double totalPay;

    //constructor
    public Employee(String name, String id, double salary, double bonus){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }
    //method to calculate pay
    void calculateTotalPay(){
        totalPay = salary + bonus;
    }
    //method to print employee information
    public void getEmployeeInfo(){
        System.out.printf("Name: %s%nID: %s%nSalary: %.2f%nBonus: %.2f%nTotal Pay: %.2f%n",
                name, id, salary, bonus,totalPay);
    }
}
