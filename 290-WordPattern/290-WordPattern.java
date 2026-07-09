// Last updated: 09/07/2026, 10:08:33
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> c_w = new HashMap<>();
        HashMap<String, Character> w_s = new HashMap<>();
        String[] words = s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        for(int i = 0;i<words.length;i++){
            char ch = pattern.charAt(i);
            String st = words[i];
            if(c_w.containsKey(ch) && !c_w.get(ch).equals(st)){
                return false;
            }
            if(w_s.containsKey(st) && !w_s.get(st).equals(ch)){
                return false;
            }
            c_w.put(ch,st);
            w_s.put(st,ch);

        }
        return true;
    }
}