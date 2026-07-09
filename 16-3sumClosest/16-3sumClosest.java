// Last updated: 09/07/2026, 10:11:09
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closest_sum = nums[0] + nums[1] + nums[2] ;
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1; 
            while(left<right){
                int cur_sum = nums[i] + nums[left] + nums[right];
                if(Math.abs(cur_sum - target) < Math.abs(closest_sum - target)){
                    closest_sum = cur_sum;
                }
                if(cur_sum < target) left++;
                else right--;
                
            }
           
        }
         return closest_sum;
    }
} 
