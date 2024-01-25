package strings;

import org.junit.Assert;
import org.junit.Test;

public class VowelsTest {

    @Test
    public void testCountVowels() {
        String inputString = "Abhinav Reddy";
        int expectedVowelCount = 4;

        int actualVowelCount = Vowels.countVowels(inputString);

        Assert.assertEquals(expectedVowelCount, actualVowelCount);
    }

    @Test
    public void testCountVowels_EmptyString() {
        String inputString = "";
        int expectedVowelCount = 0;

        int actualVowelCount = Vowels.countVowels(inputString);

        Assert.assertEquals(expectedVowelCount, actualVowelCount);
    }

    @Test
    public void testCountVowels_NoVowels() {
        String inputString = "BCDFGHJKLMNPQRSTVWXYZ";
        int expectedVowelCount = 0;

        int actualVowelCount = Vowels.countVowels(inputString);

        Assert.assertEquals(expectedVowelCount, actualVowelCount);
    }

    @Test
    public void testCountVowels_AllVowels() {
        String inputString = "aeiou";
        int expectedVowelCount = 5;

        int actualVowelCount = Vowels.countVowels(inputString);

        Assert.assertEquals(expectedVowelCount, actualVowelCount);
    }

    @Test
    public void testCountVowels_NullString() {
        int expectedVowelCount = 0; // You may adjust this based on the expected behavior

        int actualVowelCount = Vowels.countVowels(null);

        Assert.assertEquals(expectedVowelCount, actualVowelCount);
    }
}
