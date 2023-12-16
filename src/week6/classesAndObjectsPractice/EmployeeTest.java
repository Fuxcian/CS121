package week6.classesAndObjectsPractice;

public class EmployeeTest {
    public static void main(String[] args){
        Employee employee1 = new Employee("John Doe", "12345", 75600.80, 20000);
        Employee employee2 = new Employee("Jane Doe", "02168", 81390, 25000);

        employee1.calculateTotalPay();
        employee1.getEmployeeInfo();

        System.out.println();

        employee2.calculateTotalPay();
        employee2.getEmployeeInfo();
    }
}
