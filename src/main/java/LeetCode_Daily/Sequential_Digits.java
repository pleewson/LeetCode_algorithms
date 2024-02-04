package LeetCode_Daily;

import java.util.ArrayList;
import java.util.List;

public class Sequential_Digits {
    public static void main(String[] args) {

        System.out.println(sequentialDigits(55, 1000));
    }

    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> outputList = new ArrayList<>();

        for (int i = 1; i <= 9; ++i) {
            int num = i;
            int nextDigit = i + 1;

            while (num <= high && nextDigit <= 9) {
                num = num * 10 + nextDigit;
                if (num >= low && num <= high) {
                    outputList.add(num);
                }
                ++nextDigit;
            }
        }

        outputList.sort(null);
        return outputList;
    }
}

//servlets2 -coderslab

