package LeetCode_Daily.march2024;
// https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/description/?envType=daily-question&envId=2024-03-12
import nodes.ListNode;

import java.util.HashMap;
import java.util.Map;

public class Remove_Zero_Sum_Consecutive_Nodes_from_Linked_List {
    public static void main(String[] args) {
        //1,2,3,-3,4
        ListNode listNode5 = new ListNode(4);
        ListNode listNode4 = new ListNode(-3, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);

        System.out.println(removeZeroSumSublists(listNode1).getVal());
    }

    public static ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        int prefixSum = 0;
        Map<Integer, ListNode> map = new HashMap<>();

        for (ListNode current = dummy; current != null; current = current.next) {
            prefixSum += current.val;

            if (map.containsKey(prefixSum)) {
                ListNode prev = map.get(prefixSum);
                ListNode toRemove = prev.next;
                int p = prefixSum + (toRemove != null ? toRemove.val : 0);

                 while (p != prefixSum) {
                    map.remove(p);
                    toRemove = toRemove.next;
                    p += (toRemove != null ? toRemove.val : 0);
                }
                prev.next = current.next;
            } else {
                map.put(prefixSum, current);
            }
        }

        return dummy.next;
    }
}



