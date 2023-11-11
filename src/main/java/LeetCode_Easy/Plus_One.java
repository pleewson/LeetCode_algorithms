package LeetCode_Easy;


import java.util.Arrays;

public class Plus_One {
    public static void main(String[] args) {

        int[] digits = {9,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));


    }

    public static int [] plusOne(int[] digits){

        digits[digits.length-1] = digits[digits.length-1] +1;

        for(int i = digits.length-1; i > 0; i--){
            if(digits[i] == 10){
                digits[i] = 0;
                digits[i-1] = digits[i-1]+1;
            }
        }

        if(digits[0] == 10){
            digits = Arrays.copyOf(digits, digits.length+1);
            digits[0] = 1;
            digits[1] = 0;
        }

        return digits;

    }
}
