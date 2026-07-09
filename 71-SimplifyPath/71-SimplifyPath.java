// Last updated: 09/07/2026, 10:10:19
class Solution {
    public String simplifyPath(String path) {
       Stack<String> stack = new Stack<>();
       String[] splitted = path.split("/");
       for(String temp : splitted){
        if(temp.equals(".") || temp.equals("")){
            continue;
        }
        else if(temp.equals("..")){
            if(stack.isEmpty()){
                continue;
            }
            else{
                stack.pop();
            }
        }
        else{
            stack.push(temp);
        }
       }
       StringBuilder result = new StringBuilder();
       for(String temp : stack){
        result.append("/").append(temp);
       }
        return result.length() == 0 ? "/" : result.toString(); 
    }   
}