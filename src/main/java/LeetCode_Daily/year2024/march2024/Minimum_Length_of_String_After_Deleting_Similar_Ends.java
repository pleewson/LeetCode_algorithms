package LeetCode_Daily.year2024.march2024;

import java.util.ArrayDeque;
import java.util.Deque;


//https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/description/?envType=daily-question&envId=2024-03-05
public class Minimum_Length_of_String_After_Deleting_Similar_Ends {
    public static void main(String[] args) {

        String str = "bbbbbbbbbbbbbbbbbbbbbbbbbbbabbbbbbbbbbbbbbbccbcbcbccbbabbb";
        System.out.println(minimumLength(str));

    }

    public static int minimumLength(String s) {
        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            deque.add(s.charAt(i));
        }


        for (int i = 0, j = s.length(); i < s.length(); i++, j--) {
            if (deque.isEmpty() || deque.size() == 1) {
                break;
            }
            if (deque.peekFirst() == deque.peekLast()) {
                char commonCharacter = deque.peekFirst();
                while (deque.peekFirst() == commonCharacter || deque.peekLast() == commonCharacter) {
                    if (deque.peekFirst() == commonCharacter) {
                        deque.pollFirst();
                    }
                    if (deque.isEmpty()) {
                        break;
                    }
                    if (deque.peekLast() == commonCharacter) {
                        deque.pollLast();
                    }
                    if (deque.isEmpty()) {
                        break;
                    }
                }
            }
        }


        return deque.size();
    }
}
