// Last updated: 09/07/2026, 12:28:50
1class Solution {
2    public int numberOfSubarrays(int[] nums, int k) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        map.put(0,1);
5        int prefix = 0;
6        int count = 0;
7        for(int n : nums){
8            if(n%2==0) prefix += 0;
9            else prefix += 1;
10            if(map.containsKey(prefix - k)) count += map.get(prefix - k);
11            map.put(prefix,map.getOrDefault(prefix,0) + 1);
12        }
13        return count;
14    }
15}