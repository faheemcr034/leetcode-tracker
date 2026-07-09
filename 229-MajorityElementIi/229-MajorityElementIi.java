// Last updated: 09/07/2026, 10:08:50
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        if(n<3){
            for (int num : nums) {
                 if(!list.contains(num)){
                    list.add(num);
            }
            }
            return list;
        }
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key) > n/3){
                if(!list.contains(key)){
                    list.add(key);
            }
            }
        }
        return list;
    }
}