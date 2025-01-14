package LeetCode_Daily.year2025.january2025;

import java.util.ArrayList;
import java.util.List;

public class Find_the_Prefix_Common_Array_of_Two_Arrays {
    public static void main(String[] args) {
        int[] A = {1, 3, 2, 4};
        int[] B = {3, 1, 2, 4};

        findThePrefixCommonArray(A, B);
    }

    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] C = new int[A.length];
        List<Integer> tempList = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            int count = 0;
            tempList.add(A[i]);
            for (int j = 0; j <= i; j++) {
                if (tempList.contains(B[j])) {
                    count++;
                }
            }
            C[i] = count;
        }

        return C;
    }
}
