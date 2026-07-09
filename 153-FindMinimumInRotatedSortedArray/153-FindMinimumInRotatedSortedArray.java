// Last updated: 09/07/2026, 10:09:28
class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while(l<r){
            int mid = l + (r-l)/2;
            
            if(nums[mid]>nums[r]){
                l = mid+1;
            }
            else{
                r = mid;
            }
        }
        return nums[l];
    }
}