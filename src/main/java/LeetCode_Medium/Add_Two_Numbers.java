package LeetCode_Medium;

import nodes.ListNode;

//https://leetcode.com/problems/add-two-numbers/submissions/1550756261/

public class Add_Two_Numbers {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode node2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));

        addTwoNumbers(node1, node2);
    }


    //I NEED MY OWN ALGORITHM CALCULATING LARGE NUMBERS TO PASS IT

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list1 = new ListNode(0, l1);
        StringBuilder sb = new StringBuilder();

        while (list1.next != null) {
            list1 = list1.next;
            sb.append(list1.val);
        }

        long value1 = Long.parseLong(sb.reverse().toString());
        System.out.println("value1 = " + value1);

        sb.delete(0, sb.length());

        ListNode list2 = new ListNode(0, l2);
        while ((list2.next != null)) {
            list2 = list2.next;
            sb.append(list2.val);
        }

        long value2 = Long.parseLong(sb.reverse().toString());
        System.out.println("value2 = " + value2);
        System.out.println(value1 + value2);

        long sum = value1 + value2;
        String outputString = String.valueOf(sum);
        sb.delete(0, sb.length());

        sb.append(outputString);
        outputString = sb.reverse().toString();

        char[] outputArr = outputString.toCharArray();

        int val = Character.getNumericValue(outputArr[0]);
        ListNode head = new ListNode(val);
        ListNode current = head;

        if (outputString.length() >= 2) {
            for (int i = 1; i < outputString.length(); i++) {
                current.next = new ListNode(Character.getNumericValue(outputArr[i]));
                current = current.next;
            }
        }

        return head;
    }

}
