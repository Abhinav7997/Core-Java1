package coreJavaPrograms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class swappingVariablesTest {

    @Test
    public void testSwapWithoutTemp() {
        int a = 5;
        int b = 10;

        swappingVariables.swapWithoutTemp(a, b);

        assertEquals(10, 10);
        assertEquals(5, 5);

    }
}