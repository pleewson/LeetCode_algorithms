package LeetCode_Daily;

import java.util.*;

public class Daily_Temperatures {
    public static void main(String[] args) {

        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));

    }

    public static int[] dailyTemperatures(int[] temepratures) {
        
        int[] outputArr = new int[temepratures.length];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = temepratures.length - 1; i >= 0; i--) {
            int currentTemperature = temepratures[i];

            while (!stack.isEmpty() && currentTemperature >= temepratures[stack.peekLast()]) {
                stack.pollLast();
            }

            if (!stack.isEmpty()) {
                outputArr[i] = stack.peekLast() - i;
            }

            stack.offerLast(i);

        }

        return outputArr;
    }


    //last test not accepted
    /*
    public static int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> deque = new ArrayDeque<>();

        int[] res = new int[temperatures.length];

        for (int i = temperatures.length - 1; i >= 0; --i) {
            if (deque.isEmpty()) {
                deque.offerFirst(i);
                res[i] = 0;
            } else {
                while (!deque.isEmpty() && temperatures[i] >= temperatures[deque.peekFirst()]) {
                    deque.pollFirst();
                }

                if (deque.isEmpty()) {
                    res[i] = 0;
                } else {
                    res[i] = deque.peekFirst() - i;
                }

                deque.offerFirst(i);
            }
        }

        return res;
    }
     */

}
