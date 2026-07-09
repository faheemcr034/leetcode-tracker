# Last updated: 09/07/2026, 10:06:58
class Solution:
    def removeOuterParentheses(self, s: str) -> str:
        depth = 0
        stack = ""
        for ch in s:
            if ch == '(':
                if depth>0:
                    stack += ch 
                depth += 1
            elif ch == ')':
                depth -= 1
                if depth>0:
                    stack += ch
                    
        return stack
        
        