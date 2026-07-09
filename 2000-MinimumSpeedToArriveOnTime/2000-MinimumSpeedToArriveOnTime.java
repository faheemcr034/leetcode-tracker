// Last updated: 09/07/2026, 10:06:37
class Solution {

    boolean possiblespeed(int speed,int[] dist,double hour){
        double cal_hour = 0;
        for(int i = 0;i<dist.length-1;i++){
            cal_hour += Math.ceil((double) dist[i]/(double)speed);
        }
        cal_hour += (double) dist[dist.length-1]/speed;
        return cal_hour<=hour;
    }

    public int minSpeedOnTime(int[] dist, double hour) {
        int ans = -1;
        int l = 1;
        int r = 10_000_000;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(possiblespeed(mid,dist,hour)){
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