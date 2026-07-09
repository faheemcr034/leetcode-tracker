// Last updated: 09/07/2026, 10:10:44
class Solution {
    public void nextPermutation(int[] nums) {

        int i = nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        int j = nums.length-1; 
        if(i>=0){
            while(nums[j]<=nums[i]){
                j--;
            }
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
        int left = i+1;
        int right = nums.length - 1;
        while(left<right){
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(nums));
    }
    
}