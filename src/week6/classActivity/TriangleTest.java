package week6.classActivity;

public class TriangleTest {
    public static void main(String[] args){
        Triangle triangle1 = new Triangle(2.5,4.0);
        Triangle triangle2 = new Triangle(3.0,4.0);
        Triangle triangle3 = new Triangle(5.6, 9.0);

        triangle1.calculateArea();
        triangle2.calculateArea();
        triangle3.calculateArea();
    }
}
