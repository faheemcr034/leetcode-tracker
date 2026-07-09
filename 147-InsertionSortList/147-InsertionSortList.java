// Last updated: 09/07/2026, 10:09:34
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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        while(head!=null){
            ListNode cur = head;
            head = head.next;
            ListNode prev = dummy;
            while(prev.next!=null && prev.next.val < cur.val){
                prev = prev.next;
            }
            cur.next = prev.next;
            prev.next = cur;

            }
            return dummy.next;

        } 
    }
