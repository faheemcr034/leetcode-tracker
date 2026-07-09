// Last updated: 09/07/2026, 10:10:08
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
    public ListNode partition(ListNode head, int x) {
        ListNode s = new ListNode(-1);
        ListNode t1 = s;
        ListNode l = new ListNode(-1);
        ListNode t2 = l;
        while(head!=null){
            if(head.val<x){
                t1.next = head;
                t1 = t1.next;
            }
            else{
                t2.next = head;
                t2 = t2.next;
            }
            head = head.next;
        }
        t2.next = null;
        t1.next = l.next;
        return s.next;
    }
}