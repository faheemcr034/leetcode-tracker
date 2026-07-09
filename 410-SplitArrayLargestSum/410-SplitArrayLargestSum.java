// Last updated: 09/07/2026, 10:08:07
class Solution {
    boolean cansplit(int[] nums,int possible_sum,int k){
        int cur_subarray = 1;
        int cur_sum = 0;
        for(int n : nums){
            
            if((cur_sum + n) > possible_sum){
                cur_subarray++;
                cur_sum = n;
            }
            else{
                cur_sum += n;
            }
        }
        return cur_subarray <= k;
    }

    public int splitArray(int[] nums, int k) {
        int max = 0;
        int sum = 0;
        int ans = 0;
        for(int n : nums){
            sum += n;
            max = Math.max(n,max);
        }
        int l = max;
        int r = sum;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(cansplit(nums,mid,k)){
                ans = mid; 
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return ans;
    }
}