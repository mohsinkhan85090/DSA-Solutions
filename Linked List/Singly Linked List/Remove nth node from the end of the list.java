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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head ==null ||head.next==null)
        {
            return null;
        }
        int size =0;
        ListNode current= head;
        while(current !=null)
        {
            current =current.next;
            size++;
        }
        if(n==size)
        {
            return head.next;
        }
        int search =size-n;
        int i=1;
        ListNode prev= head;
        
        while(i<search)
        {
            prev = prev.next;
            i++;
        }
        prev.next =prev.next.next;
        return head;
        
    }
}