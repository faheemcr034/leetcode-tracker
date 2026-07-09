# Last updated: 09/07/2026, 10:07:24
"""
# Definition for a Node.
class Node:
    def __init__(self, val: Optional[int] = None, children: Optional[List['Node']] = None):
        self.val = val
        self.children = children
"""

class Solution:
    def preorder(self, root: 'Node') -> List[int]:
        stack = []

        def dfs(node):
            if node:
                stack.append(node.val)
                for child in node.children:
                    dfs(child)
        dfs(root)    
        return stack