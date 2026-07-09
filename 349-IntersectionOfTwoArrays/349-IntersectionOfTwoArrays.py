# Last updated: 09/07/2026, 10:08:29
class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        sort1 = sorted(nums1)
        sort2 = sorted(nums2)
        i, j = 0, 0
        result = set()

        while i < len(sort1) and j < len(sort2):
            if sort1[i] == sort2[j]:
                result.add(sort1[i])
                i += 1
                j += 1
            elif sort1[i] < sort2[j]:
                i += 1
            else:
                j += 1

        return list(result)


                