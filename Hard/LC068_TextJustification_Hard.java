// LeetCode 68 - Text Justification
// Difficulty: Hard

import java.util.ArrayList;
import java.util.List;

public class LC068_TextJustification_Hard {

    public static List<String> fullJustify(String[] words, int maxWidth) {

        List<String> result = new ArrayList<>();

        int index = 0;

        while (index < words.length) {

            int count = words[index].length();
            int last = index + 1;

            while (last < words.length) {

                if (count + 1 + words[last].length() > maxWidth) {
                    break;
                }

                count += 1 + words[last].length();
                last++;
            }

            int gaps = last - index - 1;

            StringBuilder line = new StringBuilder();

            // Last line or only one word
            if (last == words.length || gaps == 0) {

                for (int i = index; i < last; i++) {

                    line.append(words[i]);

                    if (i < last - 1) {
                        line.append(" ");
                    }
                }

                while (line.length() < maxWidth) {
                    line.append(" ");
                }
            }

            // Fully justified line
            else {

                int spaces = (maxWidth - count + gaps) / gaps;
                int extraSpaces = (maxWidth - count + gaps) % gaps;

                for (int i = index; i < last - 1; i++) {

                    line.append(words[i]);

                    int spaceCount = spaces;

                    if (extraSpaces > 0) {
                        spaceCount++;
                        extraSpaces--;
                    }

                    for (int j = 0; j < spaceCount; j++) {
                        line.append(" ");
                    }
                }

                line.append(words[last - 1]);
            }

            result.add(line.toString());

            index = last;
        }

        return result;
    }

    public static void main(String[] args) {

        String[] words = {
            "This", "is", "an", "example",
            "of", "text", "justification."
        };

        int maxWidth = 16;

        List<String> result = fullJustify(words, maxWidth);

        for (String line : result) {
            System.out.println("\"" + line + "\"");
        }
    }
}