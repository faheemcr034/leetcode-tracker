# Last updated: 09/07/2026, 10:09:08
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        cur = head
        prev = None
        while cur:
            nextnode = cur.next
            cur.next = prev
            prev = cur
            cur = nextnode
        return prev    



        