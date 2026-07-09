// Last updated: 09/07/2026, 10:10:40
class Solution {
    boolean isFirst;
     int find(int[] nums, int target,boolean isFirst){
        int l = 0;
        int r = nums.length - 1;
        
            if(isFirst){
                int ans = -1;
                while(l<=r){
                   int mid = (l+r)/2;
                   if(nums[mid] == target){
                    ans = mid;
                    r = mid - 1;
                   }
                   else if(nums[mid]<target){
                    l = mid+1;
                   }
                   else{
                    r = mid - 1;
                   } 
                }
                return ans;
                
            }
            else{
                int ans = -1;
                while(l<=r){
                   int mid = (l+r)/2;
                   if(nums[mid] == target){
                    ans = mid;
                    l = mid + 1;
                   }
                   else if(nums[mid]<target){
                    l = mid+1;
                   }
                   else{
                    r = mid - 1;
                   } 
                }
                return ans;   
            }
        }
    public int[] searchRange(int[] nums, int target) {
      
       
        int first = find(nums,target,true);
        int last = find(nums,target,false);
        return new int[]{first,last};
        
        

    }
}