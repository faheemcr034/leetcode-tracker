# Last updated: 09/07/2026, 10:06:32
class Solution:
    def minLength(self, s: str) -> int:
        stack = []
        for ch in s:
            stack.append(ch)
            if len(stack) >= 2 and (stack[-2:] == ['A','B'] or stack[-2:] == ['C','D']):
                stack.pop()
                stack.pop()
                
        return len(stack)            
        