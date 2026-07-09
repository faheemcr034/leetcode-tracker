// Last updated: 09/07/2026, 10:08:13
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!hm.containsKey(ch)){
                hm.put(ch,1);
            }
            else{
                hm.put(ch,hm.get(ch)+1);
            }
        }
        for(int j = 0;j<s.length();j++){
            char ch = s.charAt(j);
            if(hm.get(ch)==1){
                return j;
            }
        }
        return -1;
    }
}