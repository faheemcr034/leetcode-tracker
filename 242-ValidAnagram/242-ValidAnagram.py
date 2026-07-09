# Last updated: 09/07/2026, 10:08:44
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        hm = {}
        for ch in s:
            if ch in hm:
                hm[ch] += 1
            else:
                hm[ch] = 1    
        for i in t:
            if i not in hm:
                return False
            else:
                hm[i] -= 1       
        for ch in hm:
            if hm[ch] != 0:
                return False
                break 
        return True                     