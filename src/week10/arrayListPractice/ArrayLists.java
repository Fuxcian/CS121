package week10.arrayListPractice;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayLists {
    ArrayList<Integer> scores = new ArrayList<>();
    ArrayList<Character> letterGrade = new ArrayList<>();
    ArrayList<Double> gpas = new ArrayList<>();
    ArrayList<String> names = new ArrayList<>();

    public void addScore(int score){
        scores.add(score);
    }
    public void removeScore(int score){
        scores.remove(score);
    }
    public int getScore(int index){
        return scores.get(index);
    }
    public int getSizeOfScoreList(){
        return scores.size();
    }
    public void displayScores(){
        System.out.printf("Scores:%n");
        for(Object score : scores){
            System.out.printf("%d%n", score);
        }
    }
    public void displayScores2(){
        System.out.printf("Scores:%n");
        for(int i = 0; i < scores.size(); i++);
    }
    //NOTES:
    /* -Break: used to break out of for, while or do-while loops.
     * -Continue: used to skip the rest of the statements in a loop
     * and go back to the top.
     * -Return: used to end the execution of a method and return a value.
     */
}
