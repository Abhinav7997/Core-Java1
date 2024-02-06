package coreJavaPrograms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class stringRotationCheckerTest {

    @Test
    public void testAreRotations() {
        // Test Case 1: Rotations
        String str1 = "hello";
        String str2 = "lohel";
        assertTrue(stringRotationChecker.areRotations(str1, str2));

        // Test Case 2: Not Rotations
        String str3 = "abc";
        String str4 = "def";
        assertFalse(stringRotationChecker.areRotations(str3, str4));
    }
}
