package leetCode.task141;

import java.util.HashSet;

public class Solution141 {

    public static boolean hasCycle(ListNode head) {
        HashSet<ListNode> nodeSet = new HashSet<>();
        boolean hasNotCycle = true;
        while (hasNotCycle && head != null) {
            hasNotCycle = nodeSet.add(head);
            head = head.next;
        }
        return !hasNotCycle;
    }

}
