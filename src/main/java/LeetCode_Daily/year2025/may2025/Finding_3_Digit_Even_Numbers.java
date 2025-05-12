package LeetCode_Daily.year2025.may2025;

import java.util.*;

// https://leetcode.com/problems/finding-3-digit-even-numbers/description/?envType=daily-question&envId=2025-05-12

public class Finding_3_Digit_Even_Numbers {
    public static void main(String[] args) {
        int[] digits = {2, 1, 3, 0, 2, 2, 3, 0};

        System.out.println(findEvenNumbers(digits));
    }

    public static int[] findEvenNumbers(int[] digits) {
        Set<Integer> concatenationSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        int num = -1;

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int h = 0; h < digits.length; h++) {
            int digit = digits[h];
            hashMap.put(digit, (hashMap.get(digit) == null ? 1 : hashMap.get(digit) + 1));
        }


        List<Integer> shortenDigits = new ArrayList<>();

        for (Integer key : hashMap.keySet()) {
            if (hashMap.get(key) >= 3) {
                shortenDigits.add(key);
                shortenDigits.add(key);
                shortenDigits.add(key);
            } else {
                for (int i = 0; i < hashMap.get(key); i++) {
                    shortenDigits.add(key);
                }
            }
        }


        int i = 0;
        int j = 0;
        int l = 0;

        while (i < shortenDigits.size()) {

            sb.delete(0, sb.length());

            if (shortenDigits.get(i) == 0) {
                i++;
                continue;
            }

            if (j == shortenDigits.size()) {
                i++;
                continue;
            }

            if (j == i) {
                j++;
                continue;
            }

            if (l == i || l == j) {
                l++;
                continue;
            }

            if (l == shortenDigits.size()) {
                l = 0;
                j++;
                if (j == shortenDigits.size()) {
                    j = 0;
                    i++;
                }
                continue;
            }

            sb.append(shortenDigits.get(i));
            sb.append(shortenDigits.get(j));
            sb.append(shortenDigits.get(l));

            num = Integer.valueOf(sb.toString());

            if (num >= 100) {
                if (num % 2 == 0) {
                    concatenationSet.add(num);
                    System.out.println(num);
                }
            }

            l++;

        }


        List<Integer> list = new ArrayList<>(concatenationSet);
        Collections.sort(list);

        int[] outputArr = new int[concatenationSet.size()];
        int index = 0;

        for (Integer integer : list) {
            outputArr[index] = integer;
            index++;
        }

        return outputArr;
    }
}
