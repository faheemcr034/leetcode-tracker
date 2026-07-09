// Last updated: 09/07/2026, 10:10:15
class Solution {
    public void sortColors(int[] nums) {
    int low = 0;
    int mid = 0;
    int high = nums.length-1;
    while(mid<=high){
        if(nums[mid]==2){
            int temp = nums[high];
            nums[high] = nums[mid];
            nums[mid] = temp;
            high--;
        }
        else if(nums[mid]==0){
            int temp = nums[low];
            nums[low] = nums[mid];
            nums[mid] = temp;
            low++;
            mid++;
        }
        else{
            mid++;
        }

    }
    System.out.println(Arrays.toString(nums));
    }
}
