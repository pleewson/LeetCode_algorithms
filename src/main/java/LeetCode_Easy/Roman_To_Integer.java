package LeetCode_Easy;

//https://leetcode.com/problems/roman-to-integer/

import java.util.ArrayList;

public class Roman_To_Integer {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }


    public static int romanToInt(String s) {

        if( s.length() >= 1 && s.length() <= 15) {  //1. constrain

            ArrayList<Character> charArray = new ArrayList<>();

            for (int i = 0; i < s.length(); i++) {
                charArray.add(s.charAt(i));
            }

            charArray.add('0');


            int sum = 0;


            for (int i = 0; i < s.length(); i++) {


                if (charArray.get(i) == 'I') {
                    if (charArray.get(i) == 'I' && charArray.get(i + 1) == 'V') {
                        sum += 4;
                        i++;
                    } else if (charArray.get(i) == 'I' && charArray.get(i + 1) == 'X') {
                        sum += 9;
                        i++;
                    } else {
                        sum += 1;
                    }


                } else if (charArray.get(i) == 'V') {
                    sum += 5;


                } else if (charArray.get(i) == 'X') {
                    if ((charArray.get(i) == 'X' && charArray.get(i + 1) == 'L')) {
                        sum += 40;
                        i++;
                    } else if (charArray.get(i) == 'X' && charArray.get(i + 1) == 'C') {
                        sum += 90;
                        i++;
                    } else {
                        sum += 10;
                    }


                } else if (charArray.get(i) == 'L') {
                    sum += 50;


                } else if (charArray.get(i) == 'C') {
                    if ((charArray.get(i) == 'C' && charArray.get(i + 1) == 'D')) {
                        sum += 400;
                        i++;
                    } else if (charArray.get(i) == 'C' && charArray.get(i + 1) == 'M') {
                        sum += 900;
                        i++;
                    } else {
                        sum += 100;
                    }


                } else if (charArray.get(i) == 'D') {
                    sum += 500;


                } else if (charArray.get(i) == 'M') {
                    sum += 1000;
                }
            }

            return sum;
        }
        return 0;
    }
}



/*

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

 */