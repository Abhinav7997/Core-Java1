package strings;

public class ReverseWords {

    static String reverseWords(String sentence) {
        if (sentence == null) {
            return null; // You may adjust this based on the expected behavior
        }
        String[] words = sentence.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            words[i] = reverseString(words[i]);
        }
        return String.join(" ", words);
    }
    static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
}