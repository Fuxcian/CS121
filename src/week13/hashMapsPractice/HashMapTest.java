package week13.hashMapsPractice;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args){
        HashMapDemo demo = new HashMapDemo();

        demo.addToGradeList("CS121", 98);
        demo.addToGradeList("CS124", 87);
        demo.addToGradeList("CS224", 79);

        demo.displayGrades();

        System.out.println(demo.getScore("CS121"));
        demo.removeFromGradeList("CS121");
        System.out.println(demo.getScore("CS121"));

        demo.displayGrades();
    }
}
