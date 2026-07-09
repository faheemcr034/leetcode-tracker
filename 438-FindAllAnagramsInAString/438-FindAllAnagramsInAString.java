// Last updated: 09/07/2026, 10:08:02
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : p.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }
        int l = 0;
        int r = 0;
        
        int count = p.length();
        while(r<s.length()){
            int window = r - l + 1;
            char right_ch = s.charAt(r);
            if(map.containsKey(right_ch)){
                if(map.get(right_ch)>0){
                    count--;
                }
                map.put(right_ch,map.get(right_ch) - 1);
            }
            if(window>p.length()){ 
                char left_ch = s.charAt(l);
                if(map.containsKey(left_ch)){
                    if(map.get(left_ch) >= 0){
                        count ++;
                }
                map.put(left_ch,map.get(left_ch) + 1);
                }
                l++;
                
            }
            if(count == 0){
                result.add(l);
            }
        
            r++;

        }
        return result;
    }
}