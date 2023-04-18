package leetCode.task141;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution141Test {
    @Test
    public void hasCycle() {
        ListNode mainNode = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(4);
        mainNode.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;
        assertTrue(Solution141.hasCycle(mainNode));
    }
    @Test
    public void hasCycle2() {
        ListNode mainNode = new ListNode(1);
        ListNode node2 = new ListNode(2);
        mainNode.next = node2;
        node2.next = mainNode;
        assertTrue(Solution141.hasCycle(mainNode));
    }
    @Test
    public void hasCycle3() {
        ListNode mainNode = new ListNode(1);
        assertFalse(Solution141.hasCycle(mainNode));
    }
}