// LeetCode 13 - Roman to Integer
// Difficulty: Easy

public class LC013_RomanToInteger_Easy {

    public static int romanToInt(String s) {

        int total = 0;

        for (int i = 0; i < s.length() - 1; i++) {

            int current = 0;
            int next = 0;

            switch (s.charAt(i)) {
                case 'I': current = 1; break;
                case 'V': current = 5; break;
                case 'X': current = 10; break;
                case 'L': current = 50; break;
                case 'C': current = 100; break;
                case 'D': current = 500; break;
                case 'M': current = 1000; break;
            }

            switch (s.charAt(i + 1)) {
                case 'I': next = 1; break;
                case 'V': next = 5; break;
                case 'X': next = 10; break;
                case 'L': next = 50; break;
                case 'C': next = 100; break;
                case 'D': next = 500; break;
                case 'M': next = 1000; break;
            }

            if (current < next) {
                total -= current;
            } else {
                total += current;
            }
        }

        switch (s.charAt(s.length() - 1)) {
            case 'I': total += 1; break;
            case 'V': total += 5; break;
            case 'X': total += 10; break;
            case 'L': total += 50; break;
            case 'C': total += 100; break;
            case 'D': total += 500; break;
            case 'M': total += 1000; break;
        }

        return total;
    }

    public static void main(String[] args) {

        String s = "MCMXCIV";

        int result = romanToInt(s);

        System.out.println("Integer Value: " + result);
    }
}