ublic class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA,B= headB;
        while(A!=B)
        {
            if(A==null)
            {
                A= headB;
            }
            else
            {
                A= A.next;
            }
            if(B==null)
            {
                B= headA;
            }
            else
            {
                B= B.next;
            }
        }
        return A;
        
    }
}