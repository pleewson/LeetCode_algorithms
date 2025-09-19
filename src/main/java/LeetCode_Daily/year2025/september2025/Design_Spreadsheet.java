package LeetCode_Daily.year2025.september2025;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Design_Spreadsheet {

    static class Spreadsheet {
        HashMap<String, Integer> hashMap = new HashMap<>();
        char[] letters = {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };

        public Spreadsheet(int rows) {

        }

        void setCell(String cell, int value) {
            if (hashMap.containsKey(cell)) {
                hashMap.put(cell, value);
            } else {
                hashMap.put(cell, value);
            }
        }

        void resetCell(String cell) {
            hashMap.put(cell, 0);
        }

        int getValue(String formula) {
            List<Integer> values = new ArrayList<>();
            List<Character> sign = new ArrayList<>();
            StringBuilder sb = new StringBuilder();

            formula = formula.replace("=", "");
            String value = "";
            int r = 0;

            int index = 0;
            int start = 0;
            boolean somethingMore = true;
            char[] formulaArr = formula.toCharArray();
            for (char c : formulaArr) {
                if (c - 0 == '+' - 0 || c == '-' - 0 || c == '*' - 0 || c == '/' - 0) {
                    for (int i = start; i < index; i++) {
                        sb.append(formulaArr[i]);
                        start = index + 1;
                        somethingMore = false;
                    }
                    value = sb.toString();
                    sign.add(c);
                    sb.delete(0, sb.length());
                    if (value.matches("^[A-Z].*")) {
                        if (hashMap.containsKey(value)){
                            values.add(hashMap.get(value));
                        } else {
                            values.add(0);
                        }
                    } else {
                        values.add(Integer.parseInt(value));
                    }
                } else {
                    somethingMore = true;
                }
                index++;
            }

            if (somethingMore) {
                for (int i = start; i < formula.length(); i++) {
                    sb.append(formulaArr[i]);
                }
                value = sb.toString();
                if (value.matches("^[A-Z].*")) {
                    if (hashMap.containsKey(value)){
                        values.add(hashMap.get(value));
                    } else {
                        values.add(0);
                    }
                } else {
                    values.add(Integer.parseInt(value));
                }
            }

            if (values.size() == 1) {
                return values.get(0);
            }

            int sum = values.get(0);
            for (int i = 1; i < values.size(); i++) {
                if (sign.get(i - 1) == '+') {
                    sum += values.get(i);
                } else if (sign.get(i - 1) == '-') {
                    sum -= values.get(i);
                } else if (sign.get(i - 1) == '*') {
                    sum = sum * values.get(i);
                } else if (sign.get(i - 1) == '/') {
                    sum = sum / values.get(i);
                }
            }

            return sum;
        }
    }


}
