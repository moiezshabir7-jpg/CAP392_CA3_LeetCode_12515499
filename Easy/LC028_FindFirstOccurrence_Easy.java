// LeetCode 28 - Find the Index of the First Occurrence in a String
// Difficulty: Easy

public class LC028_FindFirstOccurrence_Easy {

    public static int strStr(String haystack, String needle) {

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            int j;

            for (j = 0; j < needle.length(); j++) {

                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }

            if (j == needle.length()) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";

        int result = strStr(haystack, needle);

        System.out.println("First Occurrence Index: " + result);
    }
}