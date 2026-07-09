// Last updated: 09/07/2026, 10:06:33
class Solution {

    boolean possible(int[] time,long trips,long  mid){
        long sum = 0;
        for(long  t:time){
            sum += mid/t;
        }
        return sum>=trips;
    }

    public long minimumTime(int[] time, int totalTrips) {
        int min = Integer.MAX_VALUE;
        for(int t:time){
            min = Math.min(min,t);
        }
        long ans = 0;
        long l = 1;
        long r = (long)min * totalTrips;
        while(l<=r){
            long mid = l+(r-l)/2;
            if(possible(time,totalTrips,mid)){
                ans = mid;
                r = mid - 1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }
}