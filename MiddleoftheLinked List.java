/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        // ListNode current=head;
        // int count =0;
        // while(current != null){
        //     current = current.next;
        //     count = count+1;
        // }
        // ListNode current1= head;
        // int middle = count/2;
        // for(int i = 0;i<middle;i++ ){
        //     current1 = current1.next;
        // }
        // return current1;

        ListNode slow = head;
        ListNode fast = head;
        while( fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
