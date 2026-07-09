// Last updated: 09/07/2026, 10:08:16
class Solution {

    int countlessequal(int mid,int[][] matrix){
        int count = 0;
        int n = matrix.length;
        int r = n-1;
        int c = 0;
        while(r>=0 && c<n){
        if(matrix[r][c]<=mid){
            count += r+1;
            c++;
        }
        else{
            r--;
        }
        }
        return count;
    }

    public int kthSmallest(int[][] matrix, int k) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int l = matrix[0][0];
        int r = matrix[rows-1][cols-1];
        while(l<r){
            int mid = l+(r-l)/2;
            int count  = countlessequal(mid,matrix);
            if(count<k){
                l = mid+1;
            }
            else{
                r = mid;
            }
        }
        return l;
    }
}