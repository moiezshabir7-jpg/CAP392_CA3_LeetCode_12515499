// LeetCode 125 - Valid Palindrome
// Difficulty: Easy

public class LC125_ValidPalindrome_Easy {

    public static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // Skip non-alphanumeric characters
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters
            else {
                if (Character.toLowerCase(s.charAt(left)) !=
                    Character.toLowerCase(s.charAt(right))) {
                    return false;
                }

                left++;
                right--;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        boolean result = isPalindrome(s);

        System.out.println("Is Palindrome: " + result);
    }
}