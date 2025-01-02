package LeetCode_Daily.year2024.december2024;

public class Check_if_a_Word_Occurs_As_a_Prefix_of_Any_Word_in_a_Sentence {
    public static void main(String[] args) {
//        System.out.println(isPrefixOfWord("i love eating burger", "burg"));
        System.out.println(isPrefixOfWord("this problem is an easy problem", "pro"));
    }

    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] strArr = sentence.split(" ");


        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() >= searchWord.length()) {
                if (strArr[i].substring(0, searchWord.length()).equals(searchWord)) {
                    return i+1;
                }
            }
        }

        return -1;
    }
}
