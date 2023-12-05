package week10.arrayListPractice;

public class ArrayListTest {
    public static void main(String[] args){
        ArrayLists demo = new ArrayLists();

        demo.addScore(98);
        demo.addScore(87);
        demo.addScore(93);

        System.out.printf("Scores contains %d elements.%n", demo.getSizeOfScoreList());
        demo.displayScores();

        System.out.printf("%nRemove first element: %d%n", demo.getScore(0));
        //Remove element at 0 index (first element)
        demo.removeScore(0);

        System.out.printf("%nScores contains %d elements.%n", demo.getSizeOfScoreList());
        demo.displayScores2();
    }
}
