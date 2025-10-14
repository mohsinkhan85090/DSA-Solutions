class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null)
        {
            return null;
        }
        if (head.next == null)
        {
            return null;
        }
        ListNode slow = head,fast=head,temp=null;
        while(fast!=null&&fast.next!=null)
        {
                fast=fast.next.next;
                temp=slow;
                slow= slow.next;
            
        }
        temp.next=slow.next;

        return head;
    }
}