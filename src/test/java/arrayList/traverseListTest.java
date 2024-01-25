package arrayList;

import arrayList.traverseList;
import org.junit.Test;
import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class traverseListTest {

    @Test
    public void testTraverseArrayList() {
        // Create an ArrayList for testing
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Mazda");
        stringList.add("Benz");
        stringList.add("Toyota");
        stringList.add("Chevy");

        // Redirect System.out to capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the method to perform the traversal
        traverseList.traverseArrayList(stringList);

        // Reset System.out
        System.setOut(System.out);

        // Define the expected output
        String expectedOutput = "Traversing using a regular for loop:\n" +
                "Mazda\nBenz\nToyota\nChevy\n" +
                "\nTraversing using an enhanced for loop:\n" +
                "Mazda\nBenz\nToyota\nChevy\n";

        // Compare the expected output with the actual output
        assertEquals(expectedOutput, outContent.toString());
    }
}
