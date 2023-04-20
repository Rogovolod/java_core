package leetCode.task2;

import leetCode.task23.ListNode;

import java.math.BigInteger;

public class Solution2 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rsl = new ListNode();
        ListNode temp = rsl;
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        while (l1 != null) {
            s1.append(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            s2.append(l2.val);
            l2 = l2.next;
        }
        BigInteger i1 = new BigInteger(s1.reverse().toString());
        BigInteger i2 = new BigInteger(s2.reverse().toString());
        BigInteger iRsl = i1.add(i2);
        StringBuilder s3 = new StringBuilder(iRsl.toString());
        s3 = s3.reverse();

        for (int i = 0; i < s3.length(); i++) {
            temp.next = new ListNode(Integer.parseInt(String.valueOf(s3.charAt(i))));
            temp = temp.next;
        }
        return rsl.next;
    }


}
