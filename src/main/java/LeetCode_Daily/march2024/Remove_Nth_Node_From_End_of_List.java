package LeetCode_Daily.march2024;

import nodes.ListNode;

public class Remove_Nth_Node_From_End_of_List {

    public static void main(String[] args) {
        ListNode listNode5 = new ListNode(5);
        ListNode listNode4 = new ListNode(4,listNode5);
        ListNode listNode3 = new ListNode(3,listNode4);
        ListNode listNode2 = new ListNode(2,listNode3);
        ListNode listNode1 = new ListNode(1,listNode2);

        System.out.println(removeNthFromEnd(listNode1,2));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode outputNode = new ListNode();
        ListNode fast = head; //n do przodu
        ListNode slow = head;
        ListNode prev = null;

        for(int i = 0; i < n; i++){
            while(fast != null){
                prev = slow.next;
                fast = fast.next;
            }

            if(prev == null){
                head = head.next;
            }else{
                prev.next = slow.next;
            }

        }
        //1 2 3 4 5
        return head;
    }

}


