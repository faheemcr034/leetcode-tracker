# Last updated: 09/07/2026, 10:07:18
class Solution:
    def search(self, nums: List[int], target: int) -> int:
        l,r = 0,len(nums) - 1
        while l<=r:
            mid = (l+r) // 2
            if nums[mid] == target:
                return mid
            elif nums[mid] < target:
                l = mid + 1
            else:
                r = mid - 1
        return -1    