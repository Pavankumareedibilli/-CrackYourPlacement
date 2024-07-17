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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode c1 = list1;
        ListNode c2 = list2;
        ListNode ans = new ListNode(-1);
        ListNode c3 = ans;
        while(c1!=null && c2!=null){
            if(c1.val<c2.val){
                c3.next = c1;
                c1=c1.next;
                c3=c3.next;
            }
            else {
                c3.next = c2;
                c2=c2.next;
                c3=c3.next;
            }
        }

        if(c1!=null){
            c3.next = c1;
        }
        else {
            c3.next = c2;
        }

        return ans.next;
    }
}
