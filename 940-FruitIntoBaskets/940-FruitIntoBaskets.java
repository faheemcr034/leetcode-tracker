// Last updated: 09/07/2026, 10:07:07
class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int l = 0;
        int max_len = 0;
        int len = 0;
        for(int r = 0;r<fruits.length;r++){
            map.put(fruits[r],map.getOrDefault(fruits[r],0) + 1);
            while(map.size()>2){
                if(map.containsKey(fruits[l])){
                    map.put(fruits[l],map.get(fruits[l]) - 1);
                    if(map.get(fruits[l]) == 0) map.remove(fruits[l]);
                }
                l++;
            }
            len = r-l+1;
            max_len = Math.max(len,max_len);
        }
        return max_len;
    }
}