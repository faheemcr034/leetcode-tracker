// Last updated: 09/07/2026, 10:08:15
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0;i<magazine.length();i++){
            char ch = magazine.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0) + 1) ;
        }
        for(int i = 0;i<ransomNote.length();i++){
            char r = ransomNote.charAt(i);
            if(hm.containsKey(r) && hm.get(r)>0){
                hm.put(r,hm.get(r) - 1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}