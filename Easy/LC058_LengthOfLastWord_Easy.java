// LeetCode 58 - Length of Last Word
// Difficulty: Easy

public class LC058_LengthOfLastWord_Easy {

    public static int lengthOfLastWord(String s) {

        int i = s.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        int count = 0;

        // Count characters of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }

    public static void main(String[] args) {

        String s = "Hello World";

        int result = lengthOfLastWord(s);

        System.out.println("Length of Last Word: " + result);
    }
}