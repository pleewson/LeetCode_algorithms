package LeetCode_Easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/fizz-buzz/description/
public class Fizz_Buzz {

    //Given an integer n, return a string array answer (1-indexed) where:
    //
    //answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
    //answer[i] == "Fizz" if i is divisible by 3.
    //answer[i] == "Buzz" if i is divisible by 5.
    //answer[i] == i (as a string) if none of the above conditions are true.

    public static void main(String[] args) {
        System.out.println(fizzBuzz(20));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> outputList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                outputList.add("FizzBuzz");
            } else if (i % 3 == 0) {
                outputList.add("Fizz");
            } else if (i % 5 == 0) {
                outputList.add("Buzz");
            } else {
                outputList.add("" + i);
            }
        }

        return outputList;
    }


}