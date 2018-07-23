package sortlist;

import datastructure.ListNode;

class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode pre = null, slow = head, fast = head;
        while(fast != null && fast.next != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        ListNode L1 = sortList(head);
        ListNode L2 = sortList(slow);

        return merge(L1,L2);
    }
    private ListNode merge(ListNode L1, ListNode L2){
        ListNode L = new ListNode(0), p = L;
        while(L1 != null && L2 != null){
            if(L1.val < L2.val){
                p.next = L1;
                L1 = L1.next;
            }else{
                p.next = L2;
                L2 = L2.next;
            }
            p = p.next;
        }
        if(L1 != null){
            p.next = L1;
        }
        if(L2 != null){
            p.next = L2;
        }
        return L.next;
    }
}