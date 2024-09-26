package training;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int max = 50;

        System.out.println(fibonacci(num1,num2,max));
    }

    public static List<Integer> fibonacci(int num1, int num2, int max){

        List<Integer> outputList = new ArrayList<>();
        int sum = 0;

        for(int i = 0; i <= max; i++){
            sum = num1+num2;
            outputList.add(sum);
            num1 = num2;
            num2 = sum;
        }

        return outputList;
    }
}
