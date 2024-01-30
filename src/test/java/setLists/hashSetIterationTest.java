package setLists;

import org.junit.Test;

import java.util.HashSet;

public class hashSetIterationTest {
    @Test
    public void testSetIterations(){
        HashSet<String> stringSet = new HashSet<>();

        // Add 10 strings to the HashSet
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Cherry");
        stringSet.add("Date");
        stringSet.add("Orange");
        stringSet.add("Grape");
        stringSet.add("Kiwi");
        stringSet.add("Mango");
        stringSet.add("Peach");
        stringSet.add("Pear");
        hashSetIteration.setUsingIterator(stringSet);
        hashSetIteration.setUsingForLoop(stringSet);
        hashSetIteration.setUsingEnhanced(stringSet);


    }
}