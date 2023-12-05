package week10.inheritance;

public class Manager extends SystemWorker {
    private int storeCode;

    public int getStoreCode(){return storeCode;}
    public void setStoreCode(){this.storeCode = storeCode;}

    @Override
    public String toString(){
        return String.format("Name: %s%nStore Code: %d%n", getName(),
                getStoreCode());
    }
}
