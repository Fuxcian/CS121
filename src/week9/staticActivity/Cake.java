package week9.staticActivity;

public class Cake {
    //instance variables:
    private String cakeFlavor;
    private String icingFlavor;
    private int layers;
    private static int instanceCount;

    //constructor that initializes:
    public Cake(String cakeFlavor, String icingFlavor, int layers){
        this.cakeFlavor = cakeFlavor;
        this.icingFlavor = icingFlavor;
        this.layers = layers;
        //increments static variable:
        instanceCount++;
    }
    //method to return static count:
    public static int getInstanceCount(){
        return instanceCount;
    }

}
