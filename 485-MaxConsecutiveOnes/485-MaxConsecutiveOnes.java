// Last updated: 09/07/2026, 10:07:52
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count=0;
        for(int right = 0;right<nums.length;right++){
           if(nums[right]==1){
            count++;
            max = Math.max(count,max);
           }
           else{
            count = 0;
           }
        }
        return max;
    }
}