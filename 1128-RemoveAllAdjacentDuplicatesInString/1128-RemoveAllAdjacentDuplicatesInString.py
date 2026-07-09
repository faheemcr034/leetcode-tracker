# Last updated: 09/07/2026, 10:06:57
class Solution:
    def removeDuplicates(self, s: str) -> str:
        stack = []
        for ch in s:
            if len(stack) != 0:
                if stack[-1] == ch:
                    stack.pop()
                else:
                    stack.append(ch)  
            else:
                stack.append(ch)  
        return ''.join(stack)        