# Last updated: 09/07/2026, 10:06:31
class Solution:
    def clearDigits(self, s: str) -> str:
        stack = []
        for ch in s:
            if stack and ch.isdigit():
                stack.pop()
            else:
                stack.append(ch)
        return "".join(stack)            

        