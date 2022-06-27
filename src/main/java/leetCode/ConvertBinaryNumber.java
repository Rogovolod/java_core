package leetCode;

import java.math.BigInteger;


public class ConvertBinaryNumber {

    public static int getDecimalValue(ListNode head) {
        int answer = 0;
        int length = 0;
        ListNode n = head;
        while (n.next != null) {
            n = n.next;
            length++;
        }
        n = head;
        while (n.next != null) {
            answer += (n.val * (int) Math.pow(2, length));
            n = n.next;
            length--;
        }
        answer += n.val * (int) Math.pow(2, 0);
        return answer;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

}
