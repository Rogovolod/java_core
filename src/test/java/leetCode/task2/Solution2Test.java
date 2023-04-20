package leetCode.task2;

import leetCode.task23.ListNode;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.assertEquals;

public class Solution2Test {

    @Test
    public void addTwoNumbers() {
        ListNode node1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode node2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        String actual = Objects.requireNonNull(Solution2.addTwoNumbers(node1, node2).toString());
        String expected = "7, 0, 8, null";
        assertEquals(expected, actual);
    }

    @Test
    public void addTwoNumbersWhenDifferentNodes() {
        ListNode node1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode node2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        String actual = Objects.requireNonNull(Solution2.addTwoNumbers(node1, node2).toString());
        String expected = "8, 9, 9, 9, 0, 0, 0, 1, null";
        assertEquals(expected, actual);
    }

}