package leetCode.task206;

import leetCode.task23.ListNode;

import java.util.ArrayList;

public class Solution206 {

    public static ListNode reverseList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode rsl = new ListNode();
        ListNode temp = rsl;
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            temp.next = new ListNode(list.get(i));
            temp = temp.next;
        }
        return rsl.next;
    }

}
