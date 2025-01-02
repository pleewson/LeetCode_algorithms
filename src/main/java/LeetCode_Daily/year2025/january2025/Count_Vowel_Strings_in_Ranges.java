package LeetCode_Daily.year2025.january2025;

public class Count_Vowel_Strings_in_Ranges {

    public static void main(String[] args) {
        String[] words = {"aba", "bcb", "exe", "aa", "e"};
        int[][] queries = {
                {0, 2},
                {1, 4},
                {1, 1}
        };

        vowelStrings(words, queries);
    }

    //vowel = a e i o u
    public static int[] vowelStrings(String[] words, int[][] queries) {

        int[] output = new int[queries.length];
        int count;

        int[] vowels = new int[words.length + 1];
        vowels[0] = 0;

        for (int i = 1; i < vowels.length; i++) {
            if (checkIfFirstAndLastCharacterIsVowel(words[i-1])) {
                vowels[i] = vowels[i - 1] + 1;
            } else {
                vowels[i] = vowels[i - 1];
            }
        }

        for (int i = 0; i < queries.length; i++) {
                int calculate = (vowels[queries[i][1]+1]) - (vowels[queries[i][0]]);
            output[i] = calculate;
        }

        return output;
    }

    private static boolean checkIfFirstAndLastCharacterIsVowel(String word) {
        if ((word.substring(0, 1).contains("a") || word.substring(0, 1).contains("e") || word.substring(0, 1).contains("i") ||
                word.substring(0, 1).contains("o") || word.substring(0, 1).contains("u"))
                &&
                (word.substring(word.length() - 1, word.length()).equals("a") || word.substring(word.length() - 1, word.length()).equals("e") ||
                        word.substring(word.length() - 1, word.length()).equals("i") || word.substring(word.length() - 1, word.length()).equals("o") || word.substring(word.length() - 1, word.length()).equals("u"))) {
            return true;
        } else {
            return false;
        }
    }
}
