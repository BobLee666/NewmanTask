package removefromend;

import datastructure.ListNode;

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode former = new ListNode(0);
        former.next = head;
        ListNode later = former;
        ListNode answer = later;
        while(n >= 0){
            former = former.next;
            n--;
        }
        while(former != null){
            former = former.next;
            later = later.next;
        }
        later.next = later.next.next;
        return answer.next;
    }
}
