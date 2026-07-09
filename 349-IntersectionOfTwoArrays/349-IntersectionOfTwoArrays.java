// Last updated: 09/07/2026, 10:08:23
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        HashSet<Integer> set = new HashSet<>();

        for(int n : nums2){
            if(bs(nums1,n)){
                set.add(n);
            }
        }
          int[] result = new int[set.size()];
        int i = 0;
        for(int j : set){
            result[i++] = j;

        }
        return result;

    }
        private boolean bs(int[] arr , int t){
            int left = 0;
            int right = arr.length-1;
            while(left<=right){
                int mid = (left+right)/2;
                if(arr[mid] == t){
                    return true;
                }
                else if(arr[mid]<t){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
            return false;
        }

      
    
}