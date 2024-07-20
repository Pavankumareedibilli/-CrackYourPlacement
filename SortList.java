/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null)
            return null;
        int length = 0;
        ListNode c1 = head;
        while (c1 != null) {
            length++;
            c1 = c1.next;
        }
        int[] l = new int[length];
        ListNode curr = head;
        int i = 0;
        while (curr != null) {
            l[i] = curr.val;
            curr = curr.next;
            i++;
        }
        Arrays.sort(l);
        curr = head;
        int j = 0;
        while (curr != null) {
            curr.val = l[j];
            curr = curr.next;
            j++;
        }
        return head;
    }
}
