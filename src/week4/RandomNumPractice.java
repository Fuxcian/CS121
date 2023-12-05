package week4;

import java.util.Random;

public class RandomNumPractice {
    public static void main(String[] args){
        //*****Random Numbers*****

        //Option 1:
        /* -Using a default Random instance internally to
         * generate random numbers.
         * Values returned is between 0.0 (inclusive) and 1.0 (exclusive).
         * Multiply by # and lower bound = 0.0 and upper bound = .95
         * EXAMPLES:
         * Math.random() --> Range {0.0 to 0.999}
         * Math.random() * 20 --> Range {0.0 to 19.95}
         * Math.random() * 20 + 1 --> {1.0 to 20}
         */

        //Option 2:
        /* -Creating an instance of the random class
         * Random random = new Random();
         * -Using that instance to get a double or int range
         * EXAMPLES:
         * random.nextInt(20); --> Range{0 to 19}
         * random.nextInt(20 - 2) + 1 + 2; --> Range{2 to 20}
         * random.nextDouble(20); --> Range{0 to 19.95}
         * random.nextDouble() * 20; --> Range{0 to 20}
         */

        //*****OPTION 1: Default random instance*****
        /* Math.random() is used as a default random instance internally to
         * generate random numbers.
         * double values between 0.0 (inclusive) and 1.0 (exclusive)
         * Syntax --> Math.random();
         */
        double value = Math.random();
        System.out.println("\nUsing Math.random(): \ndouble value = Math.random()" +
                "return -->" + value);
        //Range between 1 and 20
        //Syntax --> double valueTwo = Math.random() * 20 + 1; Range = {0.0 to 20.95}
        double valueTwo = Math.random() * 20 + 1;
        System.out.println("\nUsing Math.random() * 20 + 1 \nvalueTwo = " +valueTwo);

        //*****INTEGERS*****
        //Casting(int)
        //Syntax --> int randomInt = (int)(Math.random() * (max - min) + min);
        int randomInt = (int)(Math.random() * (40 - 2) +2);
        System.out.println("\nUsing (int)Math.random() * (40 - 2) + 2 \nrandomInt =" +randomInt);

        //*****OPTION 2: Instance of Random Class*****
        //***Random random = new Random()***
        //Syntax of creating an object or an instance of the Random class.
        Random random = new Random();
        //double number = random.nextDouble(20);
        //range {0 to 19}
        double number = random.nextDouble(20);
        System.out.println("\nUsing double number = random.nextDouble(20) --> number = " +number);
        System.out.printf("\nUsing double number = random.nextDouble(20) --> number = %.4f", number);

        //*****INTEGERS*****
        int randomNum = random.nextInt(40);
        System.out.println("\nUsing int randomNum = random.nextInt(40) --> randomNum = " +randomNum);
        System.out.printf("\nUsing int randomNum = random.nextInt((40 - 2) + 1 + 2 --> randomNum = ", randomNum);

        //*****Specific Range*****
        //int randomNum2 = random.nextInt((max - min) + 1) + min;
        int randomNum2 = random.nextInt((17 - 7) + 1) + 7;
        System.out.println("\nUsing int randomNum2 = random.nextInt((40 - 2) + 1) + 2 --> randomNum2 = " +randomNum2);

    }
}
