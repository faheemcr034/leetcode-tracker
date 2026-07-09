# Last updated: 09/07/2026, 10:11:14
class Solution:
    def isValid(self, s: str) -> bool:
        bracket ={'(': ')', '[': ']', '{': '}'}
        stack = []
        for i in s:
            if i in bracket:
                stack.append(i)
            else:
                if not stack or bracket[stack.pop()] != i:
                    return False    
        return not stack            