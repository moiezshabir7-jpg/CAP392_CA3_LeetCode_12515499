// LeetCode 443 - String Compression
// Difficulty: Medium

public class LC443_StringCompression_Medium {

    public static int compress(char[] chars) {

        int index = 0;
        int i = 0;

        while (i < chars.length) {

            char currentChar = chars[i];

            int count = 0;

            while (i < chars.length &&
                   chars[i] == currentChar) {

                i++;
                count++;
            }

            chars[index++] = currentChar;

            if (count > 1) {

                String countStr = String.valueOf(count);

                for (char c : countStr.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }

    public static void main(String[] args) {

        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};

        int newLength = compress(chars);

        System.out.println("Compressed Length: " + newLength);

        System.out.print("Compressed String: ");

        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i]);
        }

        System.out.println();
    }
}