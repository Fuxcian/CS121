package week13.hashMapsPractice;

import java.util.HashMap;
import java.util.Map;       //why did importing this fix it??

public class HashMapDemo {
    private Map<String, Integer> gradesMap = new HashMap<>();

    public void addToGradeList(String course, int score){
        gradesMap.put(course, score);
    }
    public void removeFromGradeList(String course){
        gradesMap.remove(course);
    }

    /* Using object for the type so we can return either
     * an int(score) or a String(a message)
     */
    public Object getScore(String course) {
        Object score;
        if (gradesMap.containsKey(course)) {
            score = gradesMap.get(course);
        } else {
            score = "Course not found.";
        }
        return score;
    }
    public void displayGrades(){
        gradesMap.forEach((course, score) -> {
            System.out.printf("Course: %s | Grade: %d\n", course, score);
        });
    }
}
