// Last updated: 09/07/2026, 10:08:12
class Solution {
    public int lengthLongestPath(String input) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int maxlen = 0;
        String[] paths = input.split("\n");
        
        for(String path:paths){
            int depth = 0; 
            for(int ch = 0;ch<path.length();ch++){
                while (depth < path.length() && path.charAt(depth) == '\t') {
                    depth++;
                }
                while (stack.size() > depth + 1) {
                    stack.pop();
                }
            }
            int name_len = path.length() - depth; 
            int p_len = stack.peek();
            int cur_len = name_len + p_len;
            if(path.contains(".")){
                maxlen = Math.max(cur_len,maxlen);
            }
            else{
                stack.push(cur_len + 1);
                }
            
        }
        return maxlen;
    }
}