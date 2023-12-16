package week9.staticActivity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CakeTest {
    @BeforeEach
    public void setUp(){
        //create instance:
        Cake chocolate = new Cake("chocolate", "chocolate", 4);
        Cake strawberry = new Cake("strawberry", "vanilla", 2);
    }
    @Test
    public void testInstanceCount(){
        assertEquals(2, Cake.getInstanceCount());
    }

}
