// Last updated: 09/07/2026, 10:29:51
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int i = 0;
4        int prefix = 0;
5        int len = Integer.MAX_VALUE;
6        for(int j = 0;j<nums.length;j++){
7            prefix += nums[j];
8            
9                while(prefix>=target){
10                    
11                    len = Math.min(len,j-i+1);
12                    prefix -= nums[i];
13                    i++;
14                }
15            
16        }
17        return len == Integer.MAX_VALUE ? 0:len ;
18    }
19}