package LeetCode_Daily.march2024;

import nodes.ListNode;

public class Middle_of_the_Linked_List {
    public static void main(String[] args) {
        ListNode listNode5 = new ListNode(5);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);

        System.out.println(middleNode(listNode1));
    }

    public static ListNode middleNode(ListNode head) {
        ListNode outPutNode = head;

        int counter = 0;
        while (head.next != null) {
            head = head.next;
            counter++;
        }

        if (counter % 2 != 0) {
            counter++;
        }

        for (int i = 0; i < counter / 2; i++) {
            outPutNode = outPutNode.next;
        }

        return outPutNode;
    }
}

