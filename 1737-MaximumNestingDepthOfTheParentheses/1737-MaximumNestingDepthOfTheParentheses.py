# Last updated: 09/07/2026, 10:06:42
class Solution:
    def maxDepth(self, s: str) -> int:
        depth = 0
        max_num = 0
        for i in s:
            if i == "(":
                depth += 1
                if max_num<depth:
                    max_num = depth
            if i == ")":
                depth -= 1
        return max_num
        