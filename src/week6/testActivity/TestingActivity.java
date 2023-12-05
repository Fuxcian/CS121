package week6.testActivity;
import org.junit.Test;
import week6.Room;

import static org.junit.Assert.assertEquals;

public class TestingActivity {
    //help for this derived from TA
    private Room hall = new Room("Hall");

    @Test
    public void getName(){
        assertEquals("Hall",hall.getName());
    }
    @Test
    public void getContent(){
        assertEquals("",hall.getContent());
    }
}
