package strings;

import org.junit.Assert;
import org.junit.Test;

public class AnagramTest {
    Anagram Anagram = new Anagram();

    @Test
    public void testStringAnagram() {
        boolean output = Anagram.areAnagrams("Abhinav", "vanihbA");
        Assert.assertTrue(output);

    }

    @Test
    public void testStringAnagram_Fail() {
        boolean output = Anagram.areAnagrams("Abhinav", "vainihbA");
        Assert.assertFalse(output);

    }
    @Test
    public void testStringAnagram_Null() {
        boolean output = Anagram.areAnagrams("Abhinav", null);
        Assert.assertFalse(output);
    }

}