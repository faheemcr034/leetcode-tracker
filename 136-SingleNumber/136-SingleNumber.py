# Last updated: 09/07/2026, 10:09:43
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        ans = 0
        for i in nums:
            ans = ans ^ i
        return ans