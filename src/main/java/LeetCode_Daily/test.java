package LeetCode_Daily;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {
        List <List<Integer>>  list2D = new ArrayList<>();


        list2D.add(new ArrayList<>());
        list2D.get(0).add(5);
        list2D.get(0).add(5);
        list2D.get(0).add(5);

        list2D.add(new ArrayList<>());
        list2D.add(new ArrayList<>());

        list2D.get(2).add(7);

        System.out.println(list2D);


    }

}
