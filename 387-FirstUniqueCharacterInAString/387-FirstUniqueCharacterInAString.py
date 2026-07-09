# Last updated: 09/07/2026, 10:08:19
class Solution:
    def firstUniqChar(self, s: str) -> int:
        hm = {}
        for ch in s:
            if ch in hm:
                hm[ch] += 1
            else:
                hm[ch] = 1    
        for i,ch in enumerate(s):
            if hm[ch] == 1:
                return i
       
        return -1    