package LeetCode_Daily.march2024;
//https://leetcode.com/problems/linked-list-cycle/description/?envType=daily-question&envId=2024-03-06

import nodes.ListNodeCycle;

public class Linked_List_Cycle {
    public static void main(String[] args) {

        //3,2,0,-4
        ListNodeCycle listNodeCycle1 = new ListNodeCycle(3);
        ListNodeCycle listNodeCycle2 = new ListNodeCycle(2);
        ListNodeCycle listNodeCycle3 = new ListNodeCycle(0);
        ListNodeCycle listNodeCycle4 = new ListNodeCycle(-4);

        listNodeCycle1.next = listNodeCycle2;
        listNodeCycle2.next = listNodeCycle3;
        listNodeCycle3.next = listNodeCycle4;
        listNodeCycle4.next = listNodeCycle2;

        System.out.println(hasCycle(listNodeCycle1));

    }

    public static boolean hasCycle(ListNodeCycle head) {
        if (head == null || head.next == null) {
            return false;
        }

        //3 2 0 -4
        //slow = 3 2 0 -4
        //fast = 3 0 2 -4
        ListNodeCycle slow = head;
        ListNodeCycle fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }


        return false;
    }
}
