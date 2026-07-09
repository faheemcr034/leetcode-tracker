// Last updated: 09/07/2026, 10:07:47
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int prefix = 0;
        int max_len = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0) prefix += -1;
            else prefix+= 1;

            if(map.containsKey(prefix)){
                int len = i - map.get(prefix);
                max_len = Math.max(max_len,len);
            }
            else{
                map.put(prefix,i);
            }
            
            
        }

        return max_len;
    }
}