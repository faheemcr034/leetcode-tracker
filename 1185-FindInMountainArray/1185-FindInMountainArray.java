// Last updated: 09/07/2026, 10:06:54
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {

    int bs(int target,MountainArray mountainArr,int l,int r,boolean ascending){
        while(l<=r){
            int mid = l+(r-l)/2;
            if(mountainArr.get(mid) == target) return mid;
            if(ascending){
                if(mountainArr.get(mid) < target){
                    l = mid+1;
                }
                else{
                    r = mid-1;
                }
            }
            else{
                if(mountainArr.get(mid) < target){
                    r = mid-1;
                }
                else{
                    l = mid+1;
                }                
            }
        }
        return -1;
    }

    public int findInMountainArray(int target, MountainArray mountainArr) {
        
        int l = 0;
        int r = mountainArr.length() - 1;
        while(l<r){
            int mid = l + (r-l)/2;            
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                l = mid + 1;
            }
            else{
                r = mid;
            }
        }
        
        int peak = l;
        
         int n = mountainArr.length();
        int ans = bs(target,mountainArr,0,peak,true);
        if(ans!=-1) return ans;
        return bs(target,mountainArr,peak+1,n-1,false);
        
    }
}