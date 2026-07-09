# Last updated: 09/07/2026, 10:10:58
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i = 0
        for j in range(1,len(nums)):
            if nums[i]!= nums[j]:
                i = i + 1
                nums[i] = nums[j]
        return i + 1    

        