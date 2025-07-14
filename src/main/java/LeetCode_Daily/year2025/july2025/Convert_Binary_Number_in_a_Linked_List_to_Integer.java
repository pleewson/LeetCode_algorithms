package LeetCode_Daily.year2025.july2025;

import nodes.ListNode;

import java.util.ArrayList;

public class Convert_Binary_Number_in_a_Linked_List_to_Integer {


    public int getDecimalValue(ListNode head) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(head.val);

        while (head.next != null) {
            arrayList.add(head.next.val);
            head = head.next;
        }

        int multiply = 0;
        int sum = 0;
        for (int i = arrayList.size() ; i >= 0; i--) {
            if(i == 1){
                sum += i*multiply
            }
        }

        return -1;
    }

}
