package arrayList;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class removeLastElementTest {

    @Test
    public void testRemoveLast() {
        // Create an ArrayList for testing
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");

        // Call the method to remove the last element
        removeLastElement.removeLast(stringList);

        // Define the expected ArrayList after removal
        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("Apple");
        expectedList.add("Banana");
        expectedList.add("Orange");

        // Compare the expected ArrayList with the result ArrayList
        assertEquals(expectedList, stringList);
    }
}
