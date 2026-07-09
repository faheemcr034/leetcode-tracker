# Last updated: 09/07/2026, 10:06:49
class Solution:
    def maxPower(self, s: str) -> int:
        max_count = 0
        cur_count = 0
        for i in range(1,len(s)):
            if s[i] == s[i-1]:
                cur_count += 1
                max_count = max(cur_count,max_count)
            else:
                cur_count = 0
        return max_count + 1 