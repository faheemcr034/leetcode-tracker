# Last updated: 09/07/2026, 10:07:16
class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        stack1 = []
        stack2 = []
        for ch in s:
            if ch.isalpha():
                stack1.append(ch)
            elif ch == "#":
                if stack1:
                    stack1.pop()
            
        for ch in t:
            if ch.isalpha():
                stack2.append(ch)
            elif ch == "#":
                if stack2:
                    stack2.pop()    
        return stack1 == stack2        