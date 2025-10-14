class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode prev = null;
        while (slow != null) {
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        ListNode first = head;
        ListNode second = prev;

        while (second != null) {
            if (first.val != second.val) {
                return false;
            }
            first = first.next;
            second = second.next;
        }

        return true; 
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
class Solution {
    
public ListNode getMiddle(ListNode head) {
   ListNode fast = head;
   ListNode slow = head;
   while (fast.next != null && fast.next.next != null) {
       fast = fast.next.next;
       slow = slow.next;
   }
   return slow;
}


public ListNode reverse(ListNode head) {
   ListNode prev = null;
   ListNode curr = head;
  
   while (curr != null) {
       ListNode next = curr.next;
       curr.next = prev;
       prev = curr;
       curr = next;
   }
   return prev;
}




public boolean isPalindrome(ListNode head) {
   if(head == null || head.next == null) {
       return true;
   }
  
   ListNode firstHalfEnd = getMiddle(head);
   ListNode secondHalfStart = reverse(firstHalfEnd.next);
   ListNode firstHalfStart = head;
  
   while(secondHalfStart != null) {
       if(secondHalfStart.val != firstHalfStart.val) {
           return false;
       }
       secondHalfStart = secondHalfStart.next;
       firstHalfStart = firstHalfStart.next;
   }
  
   return true;
}

}*/