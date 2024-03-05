package LeetCode_Daily.march2024;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Minimum_Length_of_String_After_Deleting_Similar_Ends {
    public static void main(String[] args) {

        String str = "cabaabac";
        System.out.println(minimumLength(str));

    }

    public static int minimumLength(String s) {
        Deque<Character> deque = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++){
            deque.add(s.charAt(i));
        }


        for (int i = 0, j = s.length(); i < s.length(); i++, j--) {
            if(deque.peekFirst() == deque.peekLast()){
                char commonCharacter = deque.peekFirst();

                while(deque.peekFirst() == commonCharacter || deque.peekLast() == commonCharacter){

                    if(deque.peekFirst() == commonCharacter){
                        deque.pollFirst();
                    }

                    if(deque.peekLast() == commonCharacter){
                        deque.pollLast();
                    }
                }
            }
        }

        int counter = 0;
        while(!deque.isEmpty()){
            deque.poll();
            counter++;
        }

        return counter;
    }
}
