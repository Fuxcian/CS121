package week10.ArrayListsandJumpsActivity;

import java.util.ArrayList;

public class CourseInfo {
    //ArrayLists:
    ArrayList<Integer> scores = new ArrayList<>();
    ArrayList<Character> letterGrade = new ArrayList<>();
    ArrayList<Double> gpas = new ArrayList<>();
    ArrayList<String> names = new ArrayList<>();

    //Method that adds new items:
    public void addScore(int score) {
        scores.add(score);
    }

    public void addLetterGrade(char grade) {
        letterGrade.add(grade);
    }

    public void addGPA(double gpa) {
        gpas.add(gpa);
    }

    public void addNames(String name) {
        names.add(name);
    }

    //Method that prints the class info:
    public void printTable(){
        System.out.printf("%-10s %-10s %-10s %s\n", "Name","GPA","Grade","Score");
        for(int i = 0; i < scores.size(); i++){
            System.out.printf("%-10s %-10.2f %-10c %d\n", names.get(i),
                    gpas.get(i), letterGrade.get(i), scores.get(i));
        }
    }

}
