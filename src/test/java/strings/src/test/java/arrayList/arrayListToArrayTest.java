package arrayList;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertArrayEquals;

public class arrayListToArrayTest {

    @Test
    public void testConvertToArray() {
        // Create an ArrayList for testing
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");

        // Call the method to convert ArrayList to Array
        String[] resultArray = arrayListToArray.convertToArray(stringList);

        // Define the expected array
        String[] expectedArray = {"Apple", "Banana", "Orange", "Grapes"};

        // Compare the expected array with the result array
        assertArrayEquals(expectedArray, resultArray);
    }
}
