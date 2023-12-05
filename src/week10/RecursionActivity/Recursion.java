package week10.RecursionActivity;

public class Recursion {

    //ASCII Test and Example (Video):
    /* public static void main(String[] args){
        char letterTest = 'c';
        System.out.println((char)(letterTest + 1));
    }
     */
    public int countDown(int number) {
        if (number == 0) {
            System.out.println(0);
            System.out.println("Blast Off!");
        } else {
            System.out.println(number);
            number = number - 1;
            countDown(number);
        }
        return number;
    }

    public void alphaBackwards(char letter){
        if(letter == 'a'){
            System.out.println(letter);
        } else {
            System.out.println(letter);
            //ASCII values already factored in to Java:
            letter = (char)(letter - 1);
            alphaBackwards(letter);
        }
    }
}
