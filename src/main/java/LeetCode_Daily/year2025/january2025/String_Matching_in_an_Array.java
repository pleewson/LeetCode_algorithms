package LeetCode_Daily.year2025.january2025;

import java.util.ArrayList;
import java.util.List;

public class String_Matching_in_an_Array {
    public static void main(String[] args) {
        String[] words = {"mass", "as", "hero", "superhero"};
        stringMatching(words);

    }

    public static List<String> stringMatching(String[] words) {

        List<String> outputList = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i == j || words[i].length() < words[j].length()) {
                    continue;
                }

                if (words[i].contains(words[j])) {
                    if (!outputList.contains(words[j])) {
                        outputList.add(words[j]);
                    }
                }
            }
        }

        return outputList;
    }
}
