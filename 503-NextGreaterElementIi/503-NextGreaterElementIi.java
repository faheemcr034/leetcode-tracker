// Last updated: 09/07/2026, 10:07:50
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result,-1);
        for(int i = 0;i<2*n;i++){
            while(!s.isEmpty() && nums[s.peek()] < nums[i % n]){
                result[s.pop()] = nums[i%n];
            } 
            if(i<n){
                s.push(i);
            }
        }
        
        return result;
    }
}