package week5;

import java.util.Scanner;

public class MethodsActivity{
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args)
    {
        //double getArea = getLength*getWidth;
        //function calls here
        double l , w, area;
        l = LengthMethod();
        w =  WidthMethod();
        area = getArea(l,w);
        displayData(l, w, area);

        scanner.close();
    }
    public static double getArea(double Length,double Width){
        double area = Length * Width;
        return area;
    }
    public static double LengthMethod(){
        System.out.println("Enter the length of a rectangle");
        double getLength = Integer.parseInt(scanner.nextLine());
        return getLength;
    }
    public static double WidthMethod(){
        System.out.println("Enter the width of a rectangle");
        double getWidth = Integer.parseInt(scanner.nextLine());
        return getWidth;
    }
    public static void displayData(double Length, double Width, double Area){
        System.out.println("rectangle length: " +Length);
        System.out.println("rectangle width: " +Width);
        System.out.println("rectangle area: " +Area);
    }
}
