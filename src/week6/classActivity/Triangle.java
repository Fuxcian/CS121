package week6.classActivity;

public class Triangle {
    //3-4 instance variables
    double base;
    double height;
    double area;

    //constructor
    public Triangle(double b, double h){
        this.base = b;
        this.height = h;
    }
    //method
    void calculateArea(){
        area = (base*height)/2;
        System.out.printf("The base of the triangle is: %.2f%nThe height of the triangle is: %.2f%n" +
                "The area of the triangle is: %.2f%n", base, height, area);
    }
}
