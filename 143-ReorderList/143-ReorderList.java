// Last updated: 09/07/2026, 10:09:37
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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = slow.next;
        slow.next = null;
        ListNode prev = null;
        ListNode cur = second;
        while(cur!=null){
            ListNode nxt = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nxt;
        }
        second = prev;
        ListNode first = head;
        while(second != null){
            ListNode nA = first.next;
            ListNode nB = second.next;

            first.next = second;
            second.next = nA;

            first = nA;
            second = nB;
        }
        
    }
}