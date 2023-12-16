package week10.inheritance;

public class Cashier extends SystemWorker {
    //Subclass Instance Variables
    private int tips;
    private int hours;
    private double wage;

    public void cashierPay(double wage, int hours, int tips){
        this.wage = wage;
        this.hours = hours;
        this.tips = tips;
    }
    //Getters and Setters:
    public double getWage(){ return wage;}
    public void setWage(double wage){ this.wage = wage;}
    public int getHours(){ return hours;}
    public void setHours(int hours){ this.hours = hours;}
    public int getTips(){ return tips;}
    public void setTips(int tips){this.tips = tips;}

    //toString Method:
    @Override
    public String toString(){
        return String.format("Name: %s%nWage: %.2f%nHours: %d%nTips: %d%n", getName(), getWage(),
                                    getHours(),getTips());
    }
}
