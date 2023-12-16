package week6;

import org.junit.Test;
import static org.junit.Assert.*;

public class CarTest {
    @Test
    public void getYears(){
        Car Honda = new Car("Civic",2020,false);
        int years = Honda.getYears();
        assertEquals(2020,years);
    }
    @Test
    public void testGetMake(){
        //instance of new car class
        Car HondaTwo = new Car("Accord","Honda");

        String make = HondaTwo.getMake();
        //checks to see if the object reference is not null.
        //assertNot Null()
        assertNotNull(make);
    }
    @Test
    public void testGetElectric(){
        //Create an instance of my car class
        Car Tesla = new Car("X",2022,true);
        boolean isElectric = Tesla.getElectric();
        //asserTrue() --> verify that a condition or expression is true
        assertTrue(isElectric);
    }
    @Test
    public void testGetElectrics(){
        //Created an instance of my car class
        Car Toyota = new Car("Camry", 2010, false);
        boolean isElectric = Toyota.getElectric();
        //assertFalse() --> verify that a condition or expression is false.
        assertFalse(isElectric);
    }
    @Test
    public void testModelNotEqual(){
        //2 instances of our Car class
        Car HondaCivic = new Car("Civic");
        Car HondaAccord = new Car("Accord");
        //assertNotEquals() --> Checks the two values are not equals
        assertNotEquals(HondaAccord.getModel(), HondaCivic.getModel());
    }
    @Test
    public void takeMakeIsNull(){
        Car Tesla = new Car();
        String model = Tesla.getModel();
        //assertNull() --> check whether the Tesla object reference is null.
        assertNull(model);
    }
}
