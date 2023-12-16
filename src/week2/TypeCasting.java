package week2;

public class TypeCasting {
    public static void main(String[] args){
        //18/6 should be 3.6
        //Dividing an integer in Java the decimal is truncated (removed) for precision limits.
        int intOne = 18;
        int intTwo = 5;
        int intThree = intOne/intTwo;
        //18/5 in Java will result in 3
        System.out.print("The results of integer division: ");
        System.out.println(intThree);
        //System.out.println(18/5);

        //Type Casting : Changing the data type to double for the precision.
        //You can cast one variable or the other or both:

        //double results = (double)intOne/intTwo;
        //double results = intOne/(double)intTwo;
        double results = (double)intOne/(double)intTwo;
        System.out.println(results);

        //System.out.println(18.0/5);
        //System.out.println(18/5.0);
        //System.out.println(18.0/5.0);

        //System.out.println(intOne/intTwo);
        //System.out.println(18/5);

    }
}
