package week10.abstractClasses;

public abstract class User {
    //One abstract method:
    /* Common structure for Restaurant
     * name, contact, email, password
     */
    //variables:
    protected String name;
    protected int password;
    public User(String name, int password){
        this.name = name;
        this.password = password;
    }
    // setters and getters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPassword() {
        return password;
    }
    public void setPassword(int password) {
        this.password = password;
    }
    /*
     * include abstract method
     * method signature
     */
    public abstract void displayUserInfo();
}
