package LeetCode_Daily.year2025.july2025;

import java.util.HashMap;
import java.util.Map;

//HARD
//735 / 901
//https://leetcode.com/problems/find-the-k-th-character-in-string-game-ii/solutions/6916406/beginner-freindly-java-c-python-js/?envType=daily-question&envId=2025-07-04

public class Find_the_K_th_Character_in_String_Game_II {

    public static void main(String[] args) {
        int[] operations = {1, 1};
        long k = 4;

        System.out.println(kthCharacter(k, operations));

    }

    public static char kthCharacter(long k, int[] operations) {

        Map<Character, Character> alphabetMap = createAlphabetMap();
        StringBuilder sb = new StringBuilder();
        StringBuilder tempSb = new StringBuilder();
        sb.append("a");

        for (int i = 0; i < operations.length; i++) {
            if (operations[i] == 0) {
                sb.append(sb);
                if(sb.length() > k){
                    break;
                }
            } else {
                char[] tempArr = sb.toString().toCharArray();
                for (int j = 0; j < tempArr.length; j++) {
                    tempSb.append(alphabetMap.get(tempArr[j]));
                }
                sb.append(tempSb);
                if(sb.length() > k){
                    break;
                }
                tempSb.delete(0, tempSb.length());
            }
        }

        System.out.println("wynik ®" + sb);

        long actualValue = k;
        while (true) {
            if ((actualValue - Integer.MAX_VALUE) > Integer.MAX_VALUE) {
                sb.delete(0, Integer.MAX_VALUE);
                actualValue -= Integer.MAX_VALUE;
            } else {
                return sb.toString().toCharArray()[(int) actualValue - 1];
            }
        }
    }

    public static Map<Character, Character> createAlphabetMap() {
        Map<Character, Character> alphabetMap = new HashMap<>();
        alphabetMap.put('a', 'b');
        alphabetMap.put('b', 'c');
        alphabetMap.put('c', 'd');
        alphabetMap.put('d', 'e');
        alphabetMap.put('e', 'f');
        alphabetMap.put('f', 'g');
        alphabetMap.put('g', 'h');
        alphabetMap.put('h', 'i');
        alphabetMap.put('i', 'j');
        alphabetMap.put('j', 'k');
        alphabetMap.put('k', 'l');
        alphabetMap.put('l', 'm');
        alphabetMap.put('m', 'n');
        alphabetMap.put('n', 'o');
        alphabetMap.put('o', 'p');
        alphabetMap.put('p', 'q');
        alphabetMap.put('q', 'r');
        alphabetMap.put('r', 's');
        alphabetMap.put('s', 't');
        alphabetMap.put('t', 'u');
        alphabetMap.put('u', 'v');
        alphabetMap.put('v', 'w');
        alphabetMap.put('w', 'x');
        alphabetMap.put('x', 'y');
        alphabetMap.put('y', 'z');
        alphabetMap.put('z', 'a');

        return alphabetMap;
    }

}
