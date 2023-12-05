package week10.ArrayListsandJumpsActivity;

import java.util.Scanner;

public class CourseInfoTest extends CourseInfo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       while(true){
           //Need to make an instance of CourseInfo instead of ArrayList:
           CourseInfo demo = new CourseInfo();
           System.out.println("Enter a name or q to quit");
           String name = scanner.nextLine();
           if(name.toLowerCase().equals("q")){
               demo.printTable();
               break;
           }
           demo.addNames(name);

           System.out.println("Enter gpa");
           double gpa = Double.parseDouble(scanner.nextLine());
           //write method in CourseInfo class to add gpa and call it here
           demo.addGPA(gpa);

           System.out.println("Enter letter grade");
           char letterGrade = scanner.next().charAt(0);
           scanner.nextLine(); //next() doesn't go to next line
           //call method to add letterGrade to ArrayList
           demo.addLetterGrade(letterGrade);

           System.out.println("Enter Score");
           int score = Integer.parseInt(scanner.nextLine());
           //call method to add score to ArrayList
           demo.addScore(score);

           demo.printTable();
           break;
       }
   }
}