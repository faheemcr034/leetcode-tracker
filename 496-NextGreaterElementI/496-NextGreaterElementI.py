# Last updated: 09/07/2026, 10:07:56
class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        stack = []
        hm = {}
        for i in range(len(nums2)-1,-1,-1): 
            while stack and stack[-1] <= nums2[i]:
                stack.pop()
            
            if len(stack) == 0:
                hm[nums2[i]] = -1
            else:
                hm[nums2[i]] = stack[-1]
            stack.append(nums2[i])        
        ans = []
        for j in range(len(nums1)):
            ans.append(hm[nums1[j]])     
        return ans    

