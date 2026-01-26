class Solution {
    public ListNode reverseList(ListNode head) {
           ListNode temp=head;
            ListNode prev=null;
            ListNode next=null;
            while(temp!=null)
            {
                next=temp.next;
                temp.next=prev;
                prev=temp;
                temp=next;
            }
            head=prev;
     return prev;
}
}