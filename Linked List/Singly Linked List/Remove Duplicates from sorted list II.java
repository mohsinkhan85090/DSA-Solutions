class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = new ListNode(0,head);
    ListNode curr = temp;

    while (head != null) {
        if (head.next != null && head.val == head.next.val) {
            while (head.next != null && head.val == head.next.val) {
                head = head.next;
            }
            curr.next = head.next;
        } else {
            curr = curr.next;
        }
            head = head.next;
    }
    return temp.next;
    }
}