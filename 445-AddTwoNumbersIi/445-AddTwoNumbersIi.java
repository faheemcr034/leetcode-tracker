// Last updated: 09/07/2026, 10:07:59
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
    
    ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode nxt = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nxt;
        }
        return prev;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = reverse(l1);
        ListNode second = reverse(l2);
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        int carry = 0;
        while(first!=null || second!=null){
            int val1 = (first!=null)?first.val : 0;
            int val2 = (second!=null)?second.val : 0;
            int sum = val1 + val2 + carry;
            tail.next = new ListNode(sum%10);
            tail = tail.next;
            carry = sum/10;
            if(first!=null) first = first.next;
            if(second!=null) second = second.next;
        }
        if(carry!=0){
            tail.next = new ListNode(carry);
        }
        return reverse(dummy.next);
        
    }
}