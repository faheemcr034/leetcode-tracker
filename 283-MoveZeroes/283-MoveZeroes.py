# Last updated: 09/07/2026, 10:08:35
class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        if len(nums) == 1:
            print(nums)
        
        else:
            j=0
            for i in range(len(nums)):
                if nums[i] != 0:
                    nums[j] = nums[i]
                    if i!=j:
                        nums[i] = 0
                    j+=1

            print(nums)        