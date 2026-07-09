// Last updated: 09/07/2026, 10:06:59
class Solution {

    boolean canload(int[] weights,int capacity,int days){

        int daysused = 1;
        int cur_load = 0;
        for(int w:weights){
            if((cur_load + w)>capacity){
                daysused++;
                cur_load = w;
            }
            else cur_load += w;
        }
        return daysused<=days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int max = 0;
        int ans = 0;
        for(int w:weights){
            sum+=w;
            max = Math.max(w,max);
        }
        int l = max;
        int r = sum;

        while(l<=r){
            int mid = l + (r-l)/2;
            if(canload(weights,mid,days)){
                ans = mid;
                r = mid - 1;
            }
            else{
                l  = mid + 1;
            }
        }
        return ans;
    }
}