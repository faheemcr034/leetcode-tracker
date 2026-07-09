// Last updated: 09/07/2026, 10:07:12
class Solution {

    boolean canfinish(int speed,int h,int[] piles){
        int hours = 0; 
        for(double p:piles){
            hours += Math.ceil(p/speed);
        }
        if(hours<=h) return true;
        else return false;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int max = 0;
        for(int p:piles){
            max = Math.max(p,max);
        }
        int r = max;
        int ans = 0;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(canfinish(mid,h,piles)){
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