package LeetCode_Daily.march2024;

import nodes.ListNode;

public class Remove_Nth_Node_From_End_of_List {

    public static void main(String[] args) {
        ListNode listNode5 = new ListNode(5);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);

        System.out.println(removeNthFromEnd(listNode1, 2).getNext().getVal());
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode();  //val 0 next node5
        dummy.next = head;
//        System.out.println("val= " +dummy.getVal() + "next val= " + dummy.next.getVal() + " JEDEN");
        ListNode fast = head; //n do przodu //n1 n2, n2 n3, n3 n4, n4 n5
        ListNode slow = dummy;
        for (int i = 0; i < n; i++) { //2
            fast = fast.next; //fast = 1 n2  -> 2 n3 -> [3 n4]
        }

        while (fast != null) { //[3 n4]
            slow = slow.next; // 0 n1 -> 1 n2 -> 2 n3 ?-> 3 n4
            fast = fast.next;// 3 n4 -> 4 n5 -> 5 null ?-> null
        }

        slow.next = slow.next.next; // [3 n4] n4 -> n5 -> null


//        System.out.println("val= " +dummy.getVal() + "next val= " + dummy.next.getVal() + " DWA");
//        System.out.println("val= " +dummy.next.next.getVal());
//        System.out.println("val= " +dummy.next.next.next.getVal());
//        System.out.println("val= " +dummy.next.next.next.next.getVal());
//        System.out.println("val= " +dummy.next.next.next.next.next.getVal());
//        System.out.println("val= " +dummy.next.next.next.next.next.next.getVal());
        return dummy.next;
    }

}

//ListNode dummy = new ListNode(); // Tworzymy węzeł pomocniczy, który będzie wskazywał na null
//dummy.next = head; // Ustawiamy następnik węzła pomocniczego na głowę listy
//ListNode fast = head; // Przesuwamy wskaźnik szybki od głowy listy
//ListNode slow = dummy; // Inicjujemy wskaźnik wolny na węzeł pomocniczy
//
//// Przesuwamy wskaźnik szybki o n pozycji do przodu
//for (int i = 0; i < n; i++) {
//    fast = fast.next;
//}
//
//// Przesuwamy oba wskaźniki równocześnie, aż wskaźnik szybki osiągnie koniec listy
//while (fast != null) {
//    slow = slow.next;
//    fast = fast.next;
//}
//
//// Usuwamy n-ty węzeł od końca poprzez przestawienie wskaźnika 'next' poprzedniego węzła
//slow.next = slow.next.next;
//
//return dummy.next;


