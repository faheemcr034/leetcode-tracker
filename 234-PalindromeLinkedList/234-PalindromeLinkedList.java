// Last updated: 09/07/2026, 10:08:47
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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode cur = head;
        while(cur!=null){
            stack.push(cur.val);
            cur = cur.next;
        }
        ListNode start = head;
        while(start!=null){
            if(start.val!=stack.pop()){
                return false;
            }
            else{
                start = start.next;
            }
        }
        return true;
    }
}