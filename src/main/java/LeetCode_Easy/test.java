package LeetCode_Easy;

import nodes.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the heads of two sorted linked lists, this function merges the two lists into one sorted list.
 * The resulting list is created by splicing together the nodes of the first two lists.
 * <br>
 * <br>
 * <p>
 * **Example 1:**
 * <br>Input: list1 = [1,2,4], list2 = [1,3,4]
 * <br>Output: [1,1,2,3,4,4]
 * <br>
 * <br>
 * <p>
 * <p>
 * **Example 2:**
 * <br>Input: list1 = [], list2 = []
 * <br>Output: []
 * <br>
 * <br>
 * <p>
 * <p>
 * **Example 3:**
 * <br>Input: list1 = [], list2 = [0]
 * <br>Output: [0]
 * <br>
 */
public class test {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        System.out.println(mergeTwoLists(l1,l2));
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode currentNode1 = list1;
        ListNode currentNode2 = list2;

        List<Integer> resultList = new ArrayList<>();

        while (currentNode1 != null || currentNode2 != null) {
            if (currentNode1 == null) {
                resultList.add(currentNode2.val);
                currentNode2 = currentNode2.next;
                continue;
            }

            if (currentNode2 == null) {
                resultList.add(currentNode1.val);
                currentNode1 = currentNode1.next;
                continue;
            }
            if (currentNode1.val > currentNode2.val) {
                resultList.add(currentNode2.val);
                currentNode2 = currentNode2.next;
            } else if (currentNode1.val < currentNode2.val) {
                resultList.add(currentNode1.val);
                currentNode1 = currentNode1.next;
            } else {
                resultList.add(currentNode1.val);
                resultList.add(currentNode2.val);
                currentNode1 = currentNode1.next;
                currentNode2 = currentNode2.next;
            }
        }
//[1,1,2,3,4,4]
        ListNode result = new ListNode();
        for (int num: resultList) {
            ListNode newNode = new ListNode(num);
            ListNode current = result;

            while(current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        return result.next;
    }
}