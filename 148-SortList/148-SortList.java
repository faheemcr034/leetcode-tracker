// Last updated: 09/07/2026, 10:09:32
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
    
    ListNode merge(ListNode left,ListNode right){
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        while(left!=null && right!=null){
            if(left.val<=right.val){
                tail.next = left;
                left = left.next;
            }
            else{
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }
        if(left!=null){
            tail.next = left;
        }
        else{
            tail.next = right;
        }
        return dummy.next;
    }

    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode rightpart = slow.next;
        slow.next = null;
        ListNode leftpart = head;

        leftpart = sortList(leftpart);
        rightpart = sortList(rightpart);

       return merge(leftpart,rightpart);
    }
}