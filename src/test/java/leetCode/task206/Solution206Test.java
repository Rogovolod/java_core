package leetCode.task206;

import leetCode.task23.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution206Test {

    @Test
    public void reverseList() {
        ListNode node1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode expected = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))));
        assertEquals(expected.toString(), Solution206.reverseList(node1).toString());
    }

    @Test
    public void reverseListWhenNegativeNum() {
        ListNode node1 = new ListNode(0, new ListNode(1, new ListNode(4, new ListNode(-2))));
        ListNode expected = new ListNode(-2, new ListNode(4, new ListNode(1, new ListNode(0))));
        assertEquals(expected.toString(), Solution206.reverseList(node1).toString());
    }

}