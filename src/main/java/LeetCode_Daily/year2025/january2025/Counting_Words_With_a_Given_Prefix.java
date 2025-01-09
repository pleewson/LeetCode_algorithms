package LeetCode_Daily.year2025.january2025;

public class Counting_Words_With_a_Given_Prefix {
    public static void main(String[] args) {
        String[] words = {"pay", "attention", "practice", "attend"};
        String prefix = "at";

        System.out.println(prefixCount(words, prefix));
    }


    public static int prefixCount(String[] words, String pref) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= pref.length()) {
                if (words[i].substring(0, pref.length()).equals(pref)) {
                    count++;
                }
            }
        }

        return count;
    }
}
