// LeetCode 43 - Multiply Strings
// Difficulty: Medium

public class LC043_MultiplyStrings_Medium {

    public static String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int m = num1.length();
        int n = num2.length();

        int[] result = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {

            for (int j = n - 1; j >= 0; j--) {

                int mul = (num1.charAt(i) - '0') *
                          (num2.charAt(j) - '0');

                int sum = mul + result[i + j + 1];

                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int digit : result) {

            if (sb.length() == 0 && digit == 0) {
                continue;
            }

            sb.append(digit);
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String num1 = "123";
        String num2 = "456";

        String result = multiply(num1, num2);

        System.out.println("Product: " + result);
    }
}