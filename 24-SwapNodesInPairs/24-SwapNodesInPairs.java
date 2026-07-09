// Last updated: 09/07/2026, 10:10:54
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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode first = head;

        while(first!=null && first.next!=null){
            ListNode second = first.next;
            ListNode nextfirst = second.next;
            second.next = first;
            first.next = nextfirst;
            prev.next = second;
            prev = first;
            first = nextfirst;
        }
        return dummy.next;
    }
}