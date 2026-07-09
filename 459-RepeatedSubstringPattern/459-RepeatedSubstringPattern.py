# Last updated: 09/07/2026, 10:07:55
class Solution:
    def repeatedSubstringPattern(self, s: str) -> bool:
        n = len(s)
        for size in range(1,n):
            if n % size == 0:
                substring = s[:size]
                repeats = n//size 
                if substring*repeats == s:
                    return True 
        return False
        