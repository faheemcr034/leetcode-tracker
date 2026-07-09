// Last updated: 09/07/2026, 10:10:24
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;
        int len = 1;
        ListNode cur = head;
        while(cur.next!=null){
            len++;
            cur = cur.next;
        }
        cur.next = head;
        k = k%len;
        ListNode newtail = head;
        int steps = len - k - 1;
        while(steps > 0){
            newtail = newtail.next;
            steps--;
        } 
        ListNode newhead = newtail.next;
        newtail.next = null;
        return newhead;  

    }
}