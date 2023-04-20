package leetCode.task23;

import org.junit.Test;
import java.util.Objects;

import static org.junit.Assert.assertEquals;

public class MergeKSortedListsTest {

    @Test
    public void mergeKLists() {
        ListNode[] lists = new ListNode[3];
        lists[0] = new ListNode(1, new ListNode(4, new ListNode(5)));
        lists[1] = new ListNode(1, new ListNode(3, new ListNode(4)));
        lists[2] = new ListNode(2, new ListNode(6));
        String actual = Objects.requireNonNull(MergeKSortedLists.mergeKLists(lists)).toString();
        String expected = "1, 1, 2, 3, 4, 4, 5, 6, null";
        assertEquals(expected, actual);
    }

}