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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            
            return null;
        }
        for(int i = 1;i<lists.length;i++){
            ListNode l1 = lists[0];
            ListNode l2 = lists[i];
            ListNode c1 = l1;
            ListNode c2 = l2;
            ListNode ans = new ListNode(-1);
            ListNode c3 = ans;
            while(c1!=null && c2!=null){
                if(c1.val<c2.val){
                    c3.next = c1;
                    c1= c1.next;
                    c3 = c3.next;
                }
                else{
                    c3.next = c2;
                    c2 = c2.next;
                    c3=c3.next;
                }
            }
            if(c1==null){
                c3.next = c2;
            }
            else{
                c3.next = c1;
            }

            lists[0]=ans.next;
        }

        

        return lists[0];
    }
}
