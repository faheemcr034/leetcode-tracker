// Last updated: 09/07/2026, 10:10:55
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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        return mergek(lists,0,lists.length - 1);   
    }

    ListNode mergek(ListNode[] lists,int left,int right){
        if(left==right) return lists[left];
        int mid = left+(right-left)/2;
        ListNode leftlist = mergek(lists,left,mid);
        ListNode rightlist = mergek(lists,mid+1,right);
        return mergetwolists(leftlist,rightlist);
    }
    ListNode mergetwolists(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                tail.next = l1;
                l1 = l1.next;
            }
            else{
                tail.next = l2;
                l2 = l2.next;
            } 
            tail = tail.next;
        }
        if(l1!=null) tail.next = l1;
        else tail.next = l2;
        return dummy.next;
    }
}