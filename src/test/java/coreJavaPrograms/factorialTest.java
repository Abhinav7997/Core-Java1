package coreJavaPrograms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class factorialTest {

    @Test
    public void testCalculateFactorial() {
        assertEquals(1, factorial.calculateFactorial(0));
        assertEquals(1, factorial.calculateFactorial(1));
        assertEquals(2, factorial.calculateFactorial(2));
        assertEquals(6, factorial.calculateFactorial(3));
        assertEquals(24, factorial.calculateFactorial(4));
        assertNotEquals(124, factorial.calculateFactorial(5));
        assertNotEquals(726, factorial.calculateFactorial(6));
    }
}