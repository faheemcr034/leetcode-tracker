// Last updated: 09/07/2026, 10:07:01
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefix = 0;
        int count = 0;
        for(int r = 0;r<nums.length;r++){
            prefix += nums[r];
            int rem = (prefix % k + k)%k; 
            if(map.containsKey(rem)){
                count += map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0) + 1);
        }
        return count;
    }
}