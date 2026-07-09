// Last updated: 09/07/2026, 10:11:02
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
    int count = 0;
        while(cur!=null){
            count++;
            cur = cur.next;
        }
        if(count==n){
            return head.next;
        }
        int move = count - n - 1;
        
        ListNode temp = head;
        while(move>0){
            temp = temp.next;
            move--;
        }
        temp.next = temp.next.next;
        return head;
    } 
}