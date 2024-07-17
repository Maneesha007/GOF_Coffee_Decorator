package org.example;
import org.junit.Test;

import static org.junit.Assert.*;

public class BeverageTest {

    private class BeverageImpl extends Beverage {
        public double cost() {
            return 0;
        }
        public String getDescription() {
            return "unknown beverage";
        }
    }

    @Test
    public void getDesc() {
        //fail("The test case is a prototype");
        Beverage beverage = new BeverageImpl();

        String expResult = "unknown beverage";
        String result = beverage.getDesc();

        assertEquals(expResult, result);

    }

    @Test
    public void cost() {
        //fail("The test case is a prototype");

        Beverage beverage = new BeverageImpl();

        double expResult = 0.0;
        double result = beverage.cost();

        assertEquals(expResult, result, 0.0);
    }
}