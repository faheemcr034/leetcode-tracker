# Last updated: 09/07/2026, 10:08:10
class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        x = 0
        for i in s:
            x = x ^ ord(i) 
        for j in t:
            x = x ^ ord(j)
        return chr(x)    
        