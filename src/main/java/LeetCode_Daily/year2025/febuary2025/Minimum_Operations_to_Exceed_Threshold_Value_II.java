package LeetCode_Daily.year2025.febuary2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-ii/description/?envType=daily-question&envId=2025-02-13
public class Minimum_Operations_to_Exceed_Threshold_Value_II {
    public static void main(String[] args) {
        int[] nums = {2, 11, 10,1,3};
        System.out.println(minOperations(nums, 10));
    }

    public static int minOperations(int[] nums, int k) {
        List<Long> numsList = new ArrayList<>();

        for (Integer i : nums) {
            numsList.add(i.longValue());
        }

        Collections.sort(numsList);
        List<Long> listValuesLowerThanK = valuesLowerThanK(numsList, k);

        int operations = 0;

        while (!listValuesLowerThanK.isEmpty()) {
            long minTempValue1 = 0;
            long minTempValue2 = 0;

            if (listValuesLowerThanK.size() >= 2) {
                minTempValue1 = listValuesLowerThanK.get(0);
                listValuesLowerThanK.remove(0);
                minTempValue2 = listValuesLowerThanK.get(0);
                listValuesLowerThanK.remove(0);
            } else {
                minTempValue1 = listValuesLowerThanK.get(0);
                Collections.sort(numsList);
                minTempValue2 = numsList.get(0);

                listValuesLowerThanK.remove(0);
                numsList.remove(0);
            }

            long operationResult = getOperationResult(minTempValue1, minTempValue2);

            if (operationResult >= k) {
                numsList.add(operationResult);
            } else {
                listValuesLowerThanK.add(operationResult);
                Collections.sort(listValuesLowerThanK);
            }

            operations++;
        }

        return operations;
    }

    private static long findMin(List<Long> list) {
        long minValue = list.get(0);

        for (Long i : list) {
            if (minValue > i) {
                minValue = i;
            }
        }
        return minValue;
    }

    private static List<Long> valuesLowerThanK(List<Long> numsList, int k) {
        List<Long> tempList = new ArrayList<>();
        for (Long l : numsList) {
            if (l < k) {
                tempList.add(l);
            }
        }

        return tempList;
    }


    private static long getOperationResult(long minValue1, long minValue2) {
        return ((minValue1 * 2) + minValue2);
    }


}



// first code, TLE

/*
class Solution {
    public int minOperations(int[] nums, int k) {
         List<Long> numsList = new ArrayList<>();

        for (Integer i : nums) {
            numsList.add(i.longValue());
        }

        int operations = 0;
        boolean isFinished = checkIfNumsAreGreaterOrEqualThenK(numsList, k);

        while (!isFinished) {
            long minTempValue1 = findMin(numsList);
            removeFromList(numsList, minTempValue1);

            long minTempValue2 = findMin(numsList);
            removeFromList(numsList, minTempValue2);

            insertToList(numsList, minTempValue1, minTempValue2);
            isFinished = checkIfNumsAreGreaterOrEqualThenK(numsList, k);
            operations++;
        }

        return operations;
    }

    private static long findMin(List<Long> list) {
        long minValue = list.get(0);

        for (Long i : list) {
            if (minValue > i) {
                minValue = i;
            }
        }
        return minValue;
    }


    private static void insertToList(List<Long> list, long minValue1, long minValue2) {
        long operationResult = (minValue1 * 2) + minValue2;
        list.add(operationResult);
    }


    private static void removeFromList(List<Long> list, long value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == value) {
                list.remove(i);
                break;
            }
        }
    }

    private static boolean checkIfNumsAreGreaterOrEqualThenK(List<Long> list, int k) {
        for (Long i : list) {
            if (i < k) {
                return false;
            }
        }
        return true;
    }
}
 */