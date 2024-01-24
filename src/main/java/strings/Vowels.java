package strings;

public class Vowels {
    public static int countVowels(String inputString) {
        if (inputString == null) {
            return 0; // You may adjust this based on the expected behavior
        }
        inputString = inputString.toLowerCase();
        int vowelCount = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vowelCount++;
            }
        }

        return vowelCount;

    }

}