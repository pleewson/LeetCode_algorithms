package LeetCode_Daily;

import java.util.ArrayList;

// https://leetcode.com/problems/assign-cookies/?envType=daily-question&envId=2024-01-01
public class Assign_cookies {
    public static void main(String[] args) {

        int[] childern = {1, 2, 3};
        int[] cookies = {1, 1};


        System.out.println("happy kids -> " + findContentChildren(childern, cookies));
    }

    public static int findContentChildren(int[] g, int[] s) {

        if (s.length < 1) {
            return 0;
        }

        ArrayList<Integer> cookies = new ArrayList<>();

        //fill cookies
        for (int i : s) {
            cookies.add(i);
        }

        int minIndex = 0;
        int happyKids = 0;


        for (int i = 0; i < g.length; i++) {
            int minForCurrentChild = Integer.MAX_VALUE;
            boolean removeIndex = false;

            if (cookies.size() == 0) {
                return happyKids;
            }

            for (int j = 0; j < cookies.size(); j++) {
                if (cookies.get(j) < minForCurrentChild && cookies.get(j) >= g[i]) {
                    minForCurrentChild = cookies.get(j);
                    minIndex = j;
                    removeIndex = true;
                }
            }

            if (removeIndex == true) {
                cookies.remove(minIndex);
                happyKids++;
            }

        }

        return happyKids;
    }
}
