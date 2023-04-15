package leetCode.task23;

import java.util.ArrayList;
import java.util.Comparator;

public class MergeKSortedLists {

    private static boolean checkIfNull(ListNode[] lists) {
        boolean checkIfAllNull = true;
        for (ListNode node : lists)
            if (node != null) return false;
        return checkIfAllNull;
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        if (checkIfNull(lists)) return null;
        ArrayList<Integer> listForSorting = new ArrayList<>();
        for (ListNode node : lists) {
            while (node != null) {
                listForSorting.add(node.val);
                node = node.next;
            }
        }
        listForSorting.sort(Comparator.naturalOrder());
        return createListNode(listForSorting);
    }

    private static ListNode createListNode(ArrayList<Integer> sortedList) {
        ListNode listNode = new ListNode();
        ListNode temp = listNode;
        for (int value : sortedList) {
            temp.next = new ListNode(value);
            temp = temp.next;
        }
        return listNode.next;
    }



    public static void main(String[] args) {
        ListNode[] lists = new ListNode[3];
        lists[0] = new ListNode(1, new ListNode(4, new ListNode(5)));
        lists[1] = new ListNode(1, new ListNode(3, new ListNode(4)));
        lists[2] = new ListNode(2, new ListNode(6));
        System.out.println(mergeKLists(lists));

        ListNode[] lists2 = new ListNode[1];
        lists2[0] = null;
        System.out.println(mergeKLists(lists2));
    }

}
