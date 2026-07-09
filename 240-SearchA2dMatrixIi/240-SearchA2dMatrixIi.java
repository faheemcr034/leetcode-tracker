// Last updated: 09/07/2026, 10:08:43
class Solution {
    boolean bs(int[] arr,int target){
        int l = 0;
        int r = arr.length - 1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(arr[mid] == target) return true;
            else if(arr[mid]<target) l = mid+1;
            else r = mid-1;
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        boolean ans = false;
        int rows = matrix.length;
        for(int i = 0;i<rows;i++){
             ans = bs(matrix[i],target);
            if(ans == true) return true;
        }
        return false;
    }
}