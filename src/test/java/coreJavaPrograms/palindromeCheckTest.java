package coreJavaPrograms;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class palindromeCheckTest {

    @Test
    public void testIsPalindrome() {
        // Test a palindrome number
        assertTrue(palindromeCheck.isPalindrome(121));

        // Test a non-palindrome number
        assertFalse(palindromeCheck.isPalindrome(123));

        // Test a palindrome number with an odd number of digits
        assertTrue(palindromeCheck.isPalindrome(12321));

        // Test a non-palindrome number with an odd number of digits
        assertFalse(palindromeCheck.isPalindrome(12345));

        // Test a single-digit number (palindrome by definition)
        assertTrue(palindromeCheck.isPalindrome(7));
    }
}
