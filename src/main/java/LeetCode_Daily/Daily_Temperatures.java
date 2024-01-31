package LeetCode_Daily;

import java.util.*;

public class Daily_Temperatures {
    public static void main(String[] args) {

        int[] temperatures = {99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,96,99,99,99,99,0};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
//queue
        //73 74 75 71 69 72 76 73
    }

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
}
