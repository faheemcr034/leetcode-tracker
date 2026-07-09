// Last updated: 09/07/2026, 10:11:01
class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        for(char ch : s.toCharArray()){
          if(map.containsValue(ch)) st.push(ch);
          else{
                if(st.isEmpty()) return false;
                if(map.get(ch) != st.pop()) return false;
                
                }
            }
        
        
        return st.isEmpty();
    }
 }
