# Last updated: 09/07/2026, 10:06:45
class Solution:
    def makeGood(self, s: str) -> str:
        stack = []
        for ch in s:
            if stack and stack[-1].lower() == ch.lower() and stack[-1].isupper() != ch.isupper():
                stack.pop()
            else:
                stack.append(ch)
        result = "".join(stack)  
        return result
        
               