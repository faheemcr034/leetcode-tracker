# Last updated: 09/07/2026, 10:07:44
class Solution:
    def reverseStr(self, s: str, k: int) -> str:
        result = ""
        for i in range(0,len(s),2*k):
            p1 = s[i:i+k][::-1]
            p2 = s[i+k:i+2*k]
            result += p1+p2
        return result     
        
        