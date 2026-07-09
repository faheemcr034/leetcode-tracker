# Last updated: 09/07/2026, 10:08:09
class Solution:
    def longestPalindrome(self, s: str) -> int:
        hm = {}
        for ch in s:
            if ch in hm:
                hm[ch] += 1
            else:
                hm[ch] = 1
        count = 0
        odd = 0
        for key,val in hm.items():
            count+=(val//2) * 2
            if val%2 == 1:
                odd += 1
        if odd:
            count+=1           
        return count   

