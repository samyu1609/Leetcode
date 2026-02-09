class Solution {       
     public ListNode swapPairs(ListNode head) {
                ListNode dummy = new ListNode(0, head);
                ListNode prev = dummy, temp = head;
     while (temp != null && temp.next != null) {
         ListNode first = temp.next.next;
         ListNode second = temp.next;
          second.next = temp;
           temp.next=first;
           prev.next=second;
            prev = temp;
            temp=first;
        }

        return dummy.next;        
        }
}