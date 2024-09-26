package LeetCode_Daily.september2024;

import java.util.*;

public class My_Calendar {
    List<List<Integer>> list = new ArrayList<>();
    public My_Calendar() {
    }

    public boolean book(int start, int end) {
        if (list.size() == 0) {
            list.add(Arrays.asList(start, end));
            return true;
        }

        list.sort(Comparator.comparing(innerList -> innerList.get(0)));

        if (end <= list.get(0).get(0)) {
            list.add(Arrays.asList(start, end));
            return true;
        }

        try {
            for (int i = 0, j = 1; i < list.size(); i++, j++) {
                if (start >= list.get(i).get(1) && end <= list.get(j).get(0)) {
                    list.add(Arrays.asList(start, end));
                    return true;
                }
            }
        }catch (IndexOutOfBoundsException ex){
            if(list.get(list.size()-1).get(1) <= start){
                list.add(Arrays.asList(start, end));
                return true;
            }else{
                return false;
            }
        }


        return false;
    }

    public static void main(String[] args) {
        My_Calendar myCalendar = new My_Calendar();
        System.out.println(myCalendar.book(10, 20));
        System.out.println(myCalendar.book(15, 25));
        System.out.println(myCalendar.book(20, 30));

    }
}
