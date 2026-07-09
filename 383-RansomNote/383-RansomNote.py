# Last updated: 09/07/2026, 10:08:22
class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        hm= {}
        for ch in magazine:
            hm[ch] = hm.get(ch,0) + 1
        for j in ransomNote:
            if hm.get(j,0) == 0:
                return False
            hm[j] -= 1
        return True      
            

        