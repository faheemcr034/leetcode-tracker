// Last updated: 09/07/2026, 10:07:39
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }
        int l = 0;
        int k = s1.length();
        int count = map.size();
        for(int r = 0;r<s2.length();r++){
            char ch = s2.charAt(r);
            if(map.containsKey(ch)){
                
                map.put(ch,map.get(ch) - 1);
                if(map.get(ch) == 0) count--;
                
            }

            if(r-l+1 == k){
                if(count == 0) return true;
                char left_ch = s2.charAt(l);
                if(map.containsKey(left_ch)){
                    if(map.get(left_ch) == 0) count++;
                    map.put(left_ch,map.get(left_ch) + 1);
                    
                }
                l++;
            }
            
        }
        return false;
    }
}