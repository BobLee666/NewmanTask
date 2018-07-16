package mergetwosortedlists;

import datastructure.ListNode;


public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode link = new ListNode(0);
        ListNode head = link;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                link.next = l1;
                l1 = l1.next;
            }else{
                link.next = l2;
                l2 = l2.next;
            }
            link = link.next;
        }
        if(l1 != null){
            link.next = l1;
        }
        if(l2 != null){
            link.next = l2;
        }
        return head.next;
    }
}
