# Last updated: 09/07/2026, 10:08:42
# The isBadVersion API is already defined for you.
# def isBadVersion(version: int) -> bool:

class Solution:
    def firstBadVersion(self, n: int) -> int:
        left = 1
        right = n
        ans = -1
        if n<2:
            return 1
        while left <= right:
            mid = (left + right) // 2
            if isBadVersion(mid) == True:
                ans = mid
                right = mid - 1         
            else:
                left = mid + 1
                      
        return ans