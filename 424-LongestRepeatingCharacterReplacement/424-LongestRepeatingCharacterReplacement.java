// Last updated: 09/07/2026, 10:08:04
class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int l = 0;
        int max_len = 0;
        int len = 0;
        int max_freq = 0;
        for(int r = 0;r<s.length();r++){
            char ch = s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0) + 1);
            for(int val : map.values()){
                max_freq = Math.max(max_freq,val);
            }
            while((r-l+1) - max_freq>k){
               
                map.put(s.charAt(l),map.get(s.charAt(l)) - 1);
                
                l++;
            }
            len = r-l+1;
            max_len = Math.max(max_len,len);
        }
        return max_len;

    }
}