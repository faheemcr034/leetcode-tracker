// Last updated: 09/07/2026, 10:07:13
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0;
        int r = arr.length-1;
        while(l<r){
            int mid = l + (r-l)/2;
            if(arr[mid] < arr[mid+1]){
                l = mid + 1; 
            }
            else{
                r = mid;
            }
        }
        return l;
    }
}