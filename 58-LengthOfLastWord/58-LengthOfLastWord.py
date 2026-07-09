# Last updated: 09/07/2026, 10:10:32
class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        splitted = s.split()
        last = len(splitted[-1])
        return last
        