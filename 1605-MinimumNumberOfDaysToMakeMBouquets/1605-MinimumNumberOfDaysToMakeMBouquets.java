// Last updated: 09/07/2026, 10:06:46
class Solution {

    boolean isPossible(int[] bloomday,int mid,int m,int k){
        int bouquets = 0;
        int flowers = 0;
        for(int b:bloomday){
            if(b<=mid){
                flowers++;
            }
            else{
                bouquets += flowers/k;
                flowers = 0;
            }
        }
        bouquets+=flowers/k;
        return bouquets>=m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int ans = -1;
    if((long)(m*k)>bloomDay.length) return ans;
    int min = bloomDay[0];
    int max = bloomDay[0];
    for(int n:bloomDay){
        if(n<min) min = n;
        if(n>max) max = n;
    }
    int l = min;
    int r = max;

    while(l<=r){
        int mid = l+(r-l)/2;
        if(isPossible(bloomDay,mid,m,k)){
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