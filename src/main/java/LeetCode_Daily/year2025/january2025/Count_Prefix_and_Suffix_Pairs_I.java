package LeetCode_Daily.year2025.january2025;

public class Count_Prefix_and_Suffix_Pairs_I {
    public static void main(String[] args) {
        String[] words = {"a", "aba", "ababa", "aa"};

        System.out.println(countPrefixSuffixPairs(words));
    }

    public static int countPrefixSuffixPairs(String[] words) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (i == j) {
                    continue;
                }

                if (isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }

        return count;
    }

    public static boolean isPrefixAndSuffix(String str1, String str2) {
        if (str1.length() <= str2.length()) {
            if (str2.substring(0, str1.length()).equals(str1) && str2.substring(str2.length() - str1.length(), str2.length()).equals(str1)) {
                return true;
            }
        }
        return false;
    }
}
