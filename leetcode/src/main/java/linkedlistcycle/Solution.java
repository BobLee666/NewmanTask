package linkedlistcycle;

import datastructure.ListNode;

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode p = head,pre = head;
        while(p != null && p.next != null){
            if(p.next == head){
                return true;
            }
            p = p.next;
            pre.next = head;
            pre = p;
        }
        return false;
    }
}
