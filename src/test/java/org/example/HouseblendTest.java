package org.example;
import org.junit.Test;
import static org.junit.Assert.*;
public class HouseblendTest {
    Houseblend houseblend = new Houseblend();
    @Test
    public void cost() {
// fail("The    test case is a prototype");
        assertEquals( 0.99, houseblend.cost(), 0.0);
    }
    @Test
    public void getDesc() {
// fail("The test case is a prototype");
        assertEquals("Houseblend" , houseblend.getDesc()); }}