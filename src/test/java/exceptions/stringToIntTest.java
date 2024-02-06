package exceptions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class stringToIntTest {


    @Test
    public void testConvertToIntValidInput() {
        assertEquals(23, stringToInt.convertToInt("23"));
    }

    @Test(expected = NumberFormatException.class)
    public void testConvertToIntInvalidInput() {
        stringToInt.convertToInt("45.67");
    }

    @Test(expected = NumberFormatException.class)
    public void testConvertToIntNonNumericInput() {
        stringToInt.convertToInt("test");
    }

    @Test(expected = NumberFormatException.class)
    public void testConvertToIntAlphaNumericInput() {
        stringToInt.convertToInt("123f");
    }
}