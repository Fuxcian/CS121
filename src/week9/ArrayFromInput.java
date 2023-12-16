package week9;

import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String[] dogNames = new String[3];
        String[] dogBreeds = new String[3];
        int[] dogAges = new int[3];

        for (int i = 0; i < 3; i++){
            System.out.printf("Dog %d is named: \n", i + 1);
            dogNames[i] = console.nextLine();
            System.out.printf("Dog %d is what breed?: \n", i + 1);
            dogBreeds[i] = console.nextLine();
            System.out.printf("Dog %d is how old?: \n", i + 1);
            dogAges[i] = Integer.parseInt(console.nextLine());
        }

        System.out.printf("%-14s %-14s %s \n", "Pupper Name", "Pupper Breed", "Pupper Age");
        for(int i = 0; i < dogNames.length; i++){
            //I keep getting an error in this format, unsure why:
            System.out.printf("%-14s %-14s %-14d \n",
                    dogNames[i] , dogBreeds[i],dogAges[i]);
        }
        console.close();
    }

}
