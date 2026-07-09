// Last updated: 09/07/2026, 10:07:26
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
     Stack<Integer> s = new Stack<>();
     int[] result = new int[temperatures.length];
     for(int i = 0;i<temperatures.length;i++){
        
        while(!s.isEmpty() && temperatures[s.peek()]<temperatures[i]){
           int dist = i - s.peek();
           result[s.pop()] = dist;
        }
        s.push(i);
        
     }
     return result;  
    }
}