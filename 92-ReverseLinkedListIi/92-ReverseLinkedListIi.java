// Last updated: 09/07/2026, 10:10:05
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode leftprev = dummy;
        int pos = 1;
        while(pos<left){
            leftprev = leftprev.next;
            pos++;
        }
        
        ListNode leftNode = leftprev.next;
        ListNode cur = leftNode;
        
        ListNode prev = null;
        int move = right - left+1;
        while(move > 0){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            move--;
        }
        leftprev.next = prev;
        leftNode.next = cur;
    return dummy.next;
    }

}