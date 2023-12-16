package week10.abstractClasses;

public class UserTest {
    public static void main(String[] args){
        Customer Laney = new Customer("Laney",12345,500);
        Staff Logan = new Staff("Logan", 6789,"Night");

       Laney.displayUserInfo();
       Laney.tableStatus();
       Laney.checkMenu();
       Laney.contactHelp();

       Logan.displayUserInfo();
       Logan.tableStatus();
       Logan.checkMenu();
       Logan.contactHelp();
    }
}
