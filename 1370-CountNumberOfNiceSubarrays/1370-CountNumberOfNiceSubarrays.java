// Last updated: 09/07/2026, 10:06:53
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefix = 0;
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2==0) prefix += 0;
            else prefix += 1;

            if(map.containsKey(prefix - k)){
                count += map.get(prefix - k);
            }
            map.put(prefix,map.getOrDefault(prefix,0) + 1);
        }
        return count;
    }
}