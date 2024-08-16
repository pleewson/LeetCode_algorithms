package LeetCode_Daily.september2024;

import java.util.*;

public class Maximum_Distance_in_Arrays {

    public static void main(String[] args) {

        List<Integer> arr1 = Arrays.asList(1, 4);
        List<Integer> arr2 = Arrays.asList(0, 5);
//        List<Integer> arr3 = Arrays.asList(1, 2, 3);

        List<List<Integer>> arrays = new ArrayList<>();
        arrays.add(arr1);
        arrays.add(arr2);
//        arrays.add(arr3);

        System.out.println(maxDistance(arrays));

    }


    public static int maxDistance(List<List<Integer>> arrays) {
        List<List<Integer>> outputList = new ArrayList<>();

        for (List<Integer> integerList : arrays) {
            List<Integer> internList = new ArrayList<>();
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i : integerList) {
                if (min > i) {
                    min = i;
                }
                if (max < i) {
                    max = i;
                }
            }
            internList.add(min);
            internList.add(max);
            outputList.add(internList);
        }

        int outputMin = Integer.MAX_VALUE;
        int outputMax = Integer.MIN_VALUE;
        int num = 0;
        for (List<Integer> integerList : outputList) {
            for (int i : integerList) {
                if (outputMax < i) {
                    outputMax = i;
                }
                if (outputMin > i) {
                    outputMin = i;
                }
            }
        }

        int diff = 0;
        for(int i = 0; i < outputList.size(); i++){
            for(int j = outputList.size(); j > 0; j-- ){
                int val = integerList1.get(1) - integerList2.get(0);
                if (val > diff) {
                    diff = val;
                }
            }
        }


            }
        }

        System.out.println("min " + outputMin);
        System.out.println("max " + outputMax);
        System.out.println(outputList);

        return diff;
    }
}
