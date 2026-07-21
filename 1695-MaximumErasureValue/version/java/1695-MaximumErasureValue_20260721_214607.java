// Last updated: 21/07/2026, 21:46:07
1class Solution {
2    public int maximumUniqueSubarray(int[] nums) {
3        int max_score = 0;
4        int sum = 0;
5        int i = 0;
6        HashMap<Integer,Integer> map = new HashMap<>();
7        for(int j = 0;j<nums.length;j++){
8            sum += nums[j];
9             while(map.containsKey(nums[j])){
10                sum -= nums[i];
11                map.remove(nums[i]);
12                i++;
13            }
14            map.put(nums[j],map.getOrDefault(nums[j],0) + 1);
15            max_score = Math.max(max_score,sum);
16        }
17        return max_score;
18    }
19}