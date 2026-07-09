// Last updated: 09/07/2026, 10:07:46
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while(l<r){
            int mid = l+(r-l)/2;
            if(mid%2==0){
                if(nums[mid]==nums[mid+1]){
                    l = mid+1;
                }
                else{
                    r = mid;
                }
            }
            else{
                if(nums[mid]==nums[mid-1]){
                    l = mid+1;
                }
                else{
                    r = mid;
                }
            }
        }
        return nums[l];
    }
}