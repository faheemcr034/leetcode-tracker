// Last updated: 09/07/2026, 10:08:39
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1; 
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid] == mid){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return left;
    }
}