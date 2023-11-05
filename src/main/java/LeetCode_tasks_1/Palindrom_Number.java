package LeetCode_tasks_1;

//https://leetcode.com/problems/palindrome-number/

import java.util.ArrayList;

class Palindrom_Number {

    public static void main(String[] args) {

        System.out.println(isPalindrome(121));

    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        int originalX = x;

        while (x > 0) {
            arrayList.add(x % 10);
            x = x / 10;
        }

        int powerOfTen = 1;
        int reverse = 0;

        for (int i = arrayList.size() - 1; i >= 0; i--) {
            reverse += arrayList.get(i) * powerOfTen;
            powerOfTen *= 10;
        }

        if (reverse == originalX) {
            return true;
        }

        return false;

    }
}