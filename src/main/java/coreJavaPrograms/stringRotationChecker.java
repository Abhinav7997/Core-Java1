package coreJavaPrograms;

public class stringRotationChecker {
    public static boolean areRotations(String str1, String str2) {
        // Check if the lengths of both strings are the same
        if (str1.length() != str2.length()) {
            return false;
        }

        // Concatenate str1 with itself to check for rotation
        String concatenated = str1 + str1;

        // Check if str2 is a substring of the concatenated string
        return concatenated.contains(str2);
    }
}
