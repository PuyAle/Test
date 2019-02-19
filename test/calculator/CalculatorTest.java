/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import java.lang.AssertionError;

/**
 *
 * @author puyaa
 */
public class CalculatorTest {

    Calculator c;

    @Before
    public void setUp() {
        c = new Calculator();
    }

    @Test
    public void testAdd() {

        int result = c.add(1, 1);
        assertEquals(2, result);

    }

    @Test
    public void testSub() {
        int result = c.sub(2, 1);
        assertEquals(1, result);
    }

    @Test
    public void testMult() {
        int result = c.mult(2, 1);
        assertEquals(2, result);
    }

    @Test(expected = AssertionError.class)
    public void testMultiFail() {

        int result = c.mult(2, 1);
        assertEquals(1, result);
    }

    @Test
    public void testDiv() {
        int result = c.div(2, 1);
        assertEquals(2, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivZero() {
        int result = c.div(3, 0);
        // assertEquals(0, result);
    }

}
