package org.example;
import org.junit.Test;
import static org.junit.Assert.*;
public class ExpressoTest {
    Expresso expresso = new Expresso();
    @Test
    public void cost() {
//fail("The test case is a prototype");
        assertEquals(1.99 , expresso.cost() , 0.0);
    }
    @Test
    public void getDesc() {
//fail("The test case is a prototype");
        assertEquals("Expresso" , expresso.getDesc());
    }
}