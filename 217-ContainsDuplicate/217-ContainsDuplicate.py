# Last updated: 09/07/2026, 10:08:59
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        hm = {}
        for ch in nums:
            if ch not in hm:
                hm[ch] = 1
            else:
                hm[ch] += 1
        for key,val in hm.items():
            if val>1:
                return True             
        return False    