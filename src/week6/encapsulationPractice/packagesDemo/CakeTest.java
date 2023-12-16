package week6.encapsulationPractice.packagesDemo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CakeTest {
    @Test
    public void testing(){
        //this is creating an instance
        /* this streamlines testing and allows you to use
         * different edge conditions to "break" the code
         */
        Cake cake1 = new Cake("strawberry","vanilla", 3, 8 );
        Cake cake2 = new Cake("chocolate", "chocolate",2,4);
        assertEquals("strawberry",cake1.getCakeFlavor());
        assertNotEquals("blueberry", cake2.getCakeFlavor());
    }


}
