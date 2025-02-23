package LeetCode_Medium;

import nodes.ListNode;

//https://leetcode.com/problems/add-two-numbers/submissions/1550756261/

public class Add_Two_Numbers {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode node2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));

//        addTwoNumbers(node1, node2);

        reversedCalculateStrings("113867835", "1164657874");
    }


    //CREATED MY OWN BAR CALCULATOR TO COMPLETE THIS ALGORITHM

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list1 = new ListNode(0, l1);
        StringBuilder sb = new StringBuilder();

        while (list1.next != null) {
            list1 = list1.next;
            sb.append(list1.val);
        }

        String value1 = sb.reverse().toString();
        System.out.println("value1 = " + value1);

        sb.delete(0, sb.length());

        ListNode list2 = new ListNode(0, l2);
        while ((list2.next != null)) {
            list2 = list2.next;
            sb.append(list2.val);
        }

        String value2 = sb.reverse().toString();
        System.out.println("value2 = " + value2);

        char[] sum = reversedCalculateStrings(value1, value2);
        System.out.println(sum);

        int val = Character.getNumericValue(sum[0]);
        ListNode head = new ListNode(val);
        ListNode current = head;

        if (sum.length >= 2) {
            for (int i = 1; i < sum.length; i++) {
                current.next = new ListNode(Character.getNumericValue(sum[i]));
                current = current.next;
            }
        }

        return head;
    }


    private static char[] reversedCalculateStrings(String num1, String num2) {
        char[] charNum1 = num1.toCharArray();
        char[] charNum2 = num2.toCharArray();

        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int additional = 0;
        int difference = 0;

        if (charNum1.length > charNum2.length) { ///num1>num2 length
            difference = charNum1.length - charNum2.length;
            for (int i = 1; i <= charNum1.length - difference; i++) {
                sum = charNum1[charNum1.length - i] - '0' + charNum2[charNum2.length - i] - '0';
                sum += additional;
                if (sum >= 10) {
                    if (sum == 10) {
                        sb.append(0);
                        additional = sum / 10;
                    } else {
                        sb.append((sum % 10));
                        additional = sum / 10;
                    }
                } else {
                    sb.append(sum);
                    additional = 0;
                }
            }

            for (int i = difference - 1; i >= 0; i--) {
                sum = charNum1[i] - '0';
                if (additional >= 1) {
                    sum += additional;
                    sb.append(sum % 10);
                    if (sum >= 10) {
                        additional = sum / 10;
                    } else {
                        additional = 0;
                    }
                    if (i == 0) {
                        sb.append(sum / 10);
                    }
                } else {
                    sb.append(sum);
                    additional = 0;
                }
            }

        } else if (charNum1.length < charNum2.length) { ////num1<num2 length

            difference = charNum2.length - charNum1.length;
            for (int i = 1; i <= charNum2.length - difference; i++) {
                sum = charNum2[charNum2.length - i] - '0' + charNum1[charNum1.length - i] - '0';

                sum += additional;
                if (sum >= 10) {
                    if (sum == 10) {
                        sb.append(0);
                        additional = sum / 10;
                    } else {
                        sb.append((sum % 10));
                        additional = sum / 10;
                    }
                } else {
                    sb.append(sum);
                    additional = 0;
                }
            }

            for (int i = difference - 1; i >= 0; i--) {
                sum = charNum2[i] - '0';
                if (additional >= 1) {
                    sum += additional;
                    sb.append(sum % 10);
                    if (sum >= 10) {
                        additional = sum / 10;
                    } else {
                        additional = 0;
                    }
                    if (i == 0) {
                        sb.append(sum / 10);
                    }
                } else {
                    sb.append(sum);
                    additional = 0;
                }
            }


        } else { //num1==num2 length
            for (int i = 1; i < charNum1.length + 1; i++) {
                sum = charNum1[charNum1.length - i] - '0' + charNum2[charNum2.length - i] - '0';
                if (additional > 0) {
                    sum += additional;
                    additional = 0;
                }

                if (sum >= 10) {
                    sb.append(sum % 10);
                    additional++;
                } else {
                    sb.append(sum);
                    additional = 0;
                }
            }
            if (additional >= 1) {
                sb.append(additional);
            }
        }

        if (sb.length() > 2) {
            while (sb.substring(sb.length() - 1, sb.length()).equals("0")) {
                sb.delete(sb.length() - 1, sb.length());
            }
        }

        System.out.println(sb);
//        char[] outputArr = sb.reverse().toString().toCharArray(); //REVERSED is correct output
        char[] outputArr = sb.toString().toCharArray();
        return outputArr;
    }

}
