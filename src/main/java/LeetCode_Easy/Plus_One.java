package LeetCode_Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class Plus_One {
    public static void main(String[] args) {

        int[] digits = {4,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));

        System.out.println(520 / );

    }

    public static int [] plusOne(int[] digits){

        String num = "";

        for(int i = 0; i < digits.length; i++){
            num += digits[i];
        }

        int value = Integer.parseInt(num);
        value = value +1;

        String valueInString = String.valueOf(value);

        int[] outputArr = new int[valueInString.length()];

        for(int i = 0; i < outputArr.length; i++){
            outputArr[i] = valueInString.charAt(i);
        }


//999 1000
        return digits;
    }
}
