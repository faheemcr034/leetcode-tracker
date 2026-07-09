// Last updated: 09/07/2026, 10:06:50
class Solution {

    boolean possible(int[] nums,int t,int mid){
        int sum = 0;
        for(int n:nums){
            sum += (int) Math.ceil((double)n/mid);
        }
        return sum<=t;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        
        int max = nums[0];
        for(int n:nums){
           
            if(n>max) max = n;
        }
        int l = 1;
        int r = max;
        int  ans = 0;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(possible(nums,threshold,mid)){
                ans = mid;
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }
}