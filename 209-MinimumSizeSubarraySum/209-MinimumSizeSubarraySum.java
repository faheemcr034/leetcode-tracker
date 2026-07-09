// Last updated: 09/07/2026, 10:09:01
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int sum = 0;
        int len = 0;
        int min_len = Integer.MAX_VALUE;
        for(int r = 0;r<nums.length;r++){
            sum += nums[r];
           while(sum>=target){
            len = r-l+1;
            min_len = Math.min(min_len,len);
            sum -= nums[l];
            l++; 
        }
        }
        return min_len==Integer.MAX_VALUE?0 : min_len;
    }
}