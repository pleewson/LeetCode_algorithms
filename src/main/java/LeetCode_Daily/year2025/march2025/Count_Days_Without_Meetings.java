package LeetCode_Daily.year2025.march2025;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/count-days-without-meetings/description/?envType=daily-question&envId=2025-03-24
//TLE 561/578
public class Count_Days_Without_Meetings {

    public static void main(String[] args) {
        int days = 8;
        int[][] meetings = {{3, 4}, {4, 8}, {2, 5}, {3, 8}};
        System.out.println(countDays(days, meetings));
    }

    public static int countDays(int days, int[][] meetings) {
        Set<Integer> meetingDays = new HashSet<>();

        for (int i = 0; i < meetings.length; i++) {
                for (int j = meetings[i][0]; j <= meetings[i][1]; j++) {
                    if (!meetingDays.contains(j)) {
                        meetingDays.add(j);
                    }
                }
            }

        int output = days - meetingDays.size();

        return output;
    }

}
