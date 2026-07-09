// Last updated: 09/07/2026, 10:11:21
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max_len = 0;
        int len = 0;
        int l = 0;
        for(int r = 0;r<s.length();r++){
            char c = s.charAt(r);
            if(set.contains(c)){
                
                while(set.contains(c)){
                    set.remove(s.charAt(l));
                    l++;
                }
            }
            set.add(c);
            len = r-l+1;
            max_len = Math.max(max_len,len);
        }
        return max_len;
    }
}