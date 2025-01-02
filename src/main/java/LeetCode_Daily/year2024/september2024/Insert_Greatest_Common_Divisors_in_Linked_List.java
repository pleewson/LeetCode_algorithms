package LeetCode_Daily.year2024.september2024;

import nodes.ListNode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/description/?envType=daily-question&envId=2024-09-10
public class Insert_Greatest_Common_Divisors_in_Linked_List {
    public static void main(String[] args) {

        ListNode listNode4 = new ListNode(3);
        ListNode listNode3 = new ListNode(10, listNode4);
        ListNode listNode2 = new ListNode(6, listNode3);
        ListNode listNode1 = new ListNode(18, listNode2);

        System.out.println(insertGreatestCommonDivisors(listNode1));

    }

    private static ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode dummy = head;
        ListNode outputListNode = new ListNode(0,dummy);

        while (dummy.next != null){
            dummy.next = new ListNode(findGCM(dummy.val, dummy.next.val), dummy.next);
            dummy = dummy.next.next;
        }


        return outputListNode.next;
    }


    public static int findGCM(int a, int b){
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        for(int i = 1; i <= a || i <= b; i++){
            if(a%i == 0){
                listA.add(i);
            }
            if(b%i == 0){
                listB.add(i);
            }
        }


        if(listA.size() < listB.size()){
            for(Integer numA : listA.reversed()){
                for(Integer numB : listB.reversed()){
                    if(numA < numB){
                        continue;
                    }
                    if (numA.equals(numB)){
                        return numA;
                    }
                }
            }
        }else{
            for(Integer numB : listB.reversed()){
                for(Integer numA : listA.reversed()){
                    if(numB < numA){
                        continue;
                    }
                    System.out.println("A " + numA + " B " + numB);
                    if (numB.equals(numA)){
                        return numB;
                    }

                }
            }
        }

        return -1;
    }

}
