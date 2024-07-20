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
    public boolean isPalindrome(ListNode head) {
        if(head == null ) return true;
        int length = 0;
        ListNode c1 = head;
        while( c1 != null){
            length++;
            c1 = c1.next;
        }
        int arr[] =new int[length];
        ListNode c = head;
        int i = 0;
        while(c!=null){
            arr[i]= c.val;
            c=c.next;
            i++;
        }
        int l = 0;
        int r = arr.length-1;
        while(l<r){
            if(arr[l]!=arr[r]){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}


// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         Stack<Integer> stack = new Stack();
//         ListNode curr = head;
//         while(curr != null) {
//             stack.push(curr.val);
//             curr = curr.next;
//         }
//         curr = head;
//         while(curr != null && curr.val == stack.pop()) {
//             curr = curr.next;
//         }
//         return curr == null;
//     }
// }
