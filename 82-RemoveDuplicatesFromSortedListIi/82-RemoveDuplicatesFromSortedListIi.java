// Last updated: 09/07/2026, 10:10:09
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode cur = prev.next;
        while(cur!=null){
            if(cur.next!=null && cur.val == cur.next.val){
                int dupval = cur.val;
                while(cur!=null && dupval==cur.val){
                    cur = cur.next;
                }
                prev.next = cur;
            }
            else{
                prev = cur;
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}