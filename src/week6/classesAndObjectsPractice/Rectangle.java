package week6.classesAndObjectsPractice;

public class Rectangle {
    int length;
    int width;
    int area;

    public Rectangle(int l, int w){
        this.length = l;
        this.width = w;
    }

    void calculateArea(){
        area = length*width;
    }
    void printArea(){
        System.out.printf("The area of the rectangle is %d", area);
    }
}
