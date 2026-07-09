# Last updated: 09/07/2026, 10:10:47
class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        def fp(findfirst):
            l, r = 0, len(nums) - 1
            cur = -1
            while l <= r:
                mid = (l+r) // 2
                if nums[mid] == target:
                    cur = mid
                    if findfirst:
                        r = mid - 1
                    else:
                        l = mid + 1
                    

                elif target < nums[mid]:
                    r = mid - 1
                else:
                    l = mid + 1    
            return cur
        first = fp(True)
        last = fp(False)
        return [first,last] 