# Last updated: 09/07/2026, 10:10:20
class Solution:
    def mySqrt(self, x: int) -> int:
        left = 0
        right = x
        ans = 0
        if x<2:
            return x
        
        while left<=right:
            mid = (left+right) // 2
            sq = mid*mid
            if sq == x:
                return round(mid)
            elif sq < x:
                ans = mid
                left = mid+1
            else:
                right = mid-1

        return floor(ans)
        