class Solution {
    public ListNode reverseIterative(ListNode head) {
        if(head == null || head.next==null)
        {
            return head;
        }
        ListNode prev = head;
        ListNode current = head.next;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head.next= null;
        return prev;
        
    }
}