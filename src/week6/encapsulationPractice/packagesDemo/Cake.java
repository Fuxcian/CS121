package week6.encapsulationPractice.packagesDemo;

public class Cake {
    //instance variables
    public String cakeFlavor;
    public String icingFlavor;
    private int layers; // if public or default I can access this in test-class, when private an error will occur

    private int slices;

    //constructor
    public Cake(String cakeFlavor, String icingFlavor, int layers, int slices) {
        //variables are assigned the values of each instance of a Student
        this.cakeFlavor = cakeFlavor;
        this.icingFlavor = icingFlavor;
        this.layers = layers;
        this.slices = slices;
    }
    //4 methods w/ different access modifiers
    public void cakeFlavor() {
        //don't get confused with getters
        System.out.println("The flavor of this cake is" +cakeFlavor);
    }
    public String getCakeFlavor(){
        return cakeFlavor;
    }
    private int getLayers(){ return layers; }
    protected int getSlices() { return slices; }


}

