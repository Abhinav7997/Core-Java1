package coreJavaPrograms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class arraySumTest {

    @Test
    public void testCalculateSum() {
        int[] array = {1, 2, 3, 4, 5};
        int expectedSum = 15;
        assertEquals(expectedSum, arraySum.calculateSum(array));
    }

    @Test
    public void testEmptyArray() {
        int[] array = {};
        int expectedSum = 0;
        assertEquals(expectedSum, arraySum.calculateSum(array));
    }

    @Test
    public void testSingleElementArray() {
        int[] array = {7};
        int expectedSum = 7;
        assertEquals(expectedSum, arraySum.calculateSum(array));
    }

    @Test
    public void testNegativeNumbers() {
        int[] array = {-1, -2, -3, -4, -5};
        int expectedSum = -10;
        assertNotEquals(expectedSum, arraySum.calculateSum(array));
    }
}