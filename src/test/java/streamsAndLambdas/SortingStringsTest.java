package streamsAndLambdas;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SortingStringsTest {
    @Test
    public void testStringSort() {
        List<String> list = new java.util.ArrayList<>();
        list.add("ash");
        list.add("oak");
        list.add("elm");
        list.add("pine");
        list.add("maple");
        list.add("birch");
        list.add("spruce");
        Assert.assertEquals(list, SortingStrings.sortBasedOnLength(new String[]{"maple", "birch", "oak", "pine", "elm", "spruce", "ash"}));
    }
}