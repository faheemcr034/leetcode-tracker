// Last updated: 09/07/2026, 10:09:21
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        int lenA=0;
        int lenB=0;
        while(a!=null){
            lenA++;
            a = a.next;
        }
        while(b!=null){
            lenB++;
            b = b.next;
        }
        int diff = Math.abs(lenA-lenB);
        if(lenA>lenB){
            while(diff>0){
                headA = headA.next;
                diff--;
            }
        }
        else{
            while(diff>0){
                headB = headB.next;
                diff--;
            }            
        }
        ListNode curA = headA;
        ListNode curB = headB;
       while(curA!=null){
        if(curA==curB) return curA;
        curA = curA.next;
        curB = curB.next;
       }
    return curA;
    }
}