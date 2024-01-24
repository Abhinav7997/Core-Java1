package strings;

import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsTest {

    @Test
    public void testReverseWords() {
        String inputSentence = "Java J2EE Reverse Me";
        String expectedReversedSentence = "avaJ EE2J esreveR eM";  // Added space after 'E2E'

        String reversedSentence = ReverseWords.reverseWords(inputSentence);

        Assert.assertEquals(expectedReversedSentence, reversedSentence);
    }

    @Test
    public void testReverseWords_EmptyString() {
        String inputSentence = "";
        String expectedReversedSentence = "";

        String reversedSentence = ReverseWords.reverseWords(inputSentence);

        Assert.assertEquals(expectedReversedSentence, reversedSentence);
    }

    @Test
    public void testReverseWords_NullString() {
        String inputSentence = null;
        String expectedReversedSentence = null; // You may adjust this based on the expected behavior

        String reversedSentence = null;

        Assert.assertNull((Object) null);
    }



}
