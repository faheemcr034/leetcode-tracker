// Last updated: 19/07/2026, 12:57:41
1class Solution {
2    public int threeSumClosest(int[] nums, int target) {
3        Arrays.sort(nums);
4        int closestsum = nums[0] + nums[1] + nums[2];
5        for(int i = 0;i<nums.length-2;i++){
6            int j = i+1;
7            int k = nums.length - 1;
8            while(j<k){
9                int sum = nums[i] + nums[j] + nums[k];
10                if(Math.abs(sum - target) < Math.abs(closestsum - target)){
11                    closestsum = sum;
12                }
13                if(sum<target) j++;
14                else if(sum>target) k--;
15                else return sum;
16            }
17           
18        }
19         return closestsum;
20    }
21}