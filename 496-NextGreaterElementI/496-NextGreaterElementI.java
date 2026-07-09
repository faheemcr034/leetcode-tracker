// Last updated: 09/07/2026, 10:07:51
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums2.length;
        Stack<Integer> stack = new Stack<>();
        for(int i = n-1;i>=0;i--){
            while(!stack.isEmpty() && nums2[i] >= stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()) map.put(nums2[i],-1);
            else{
                map.put(nums2[i],stack.peek());
            }
            stack.push(nums2[i]);
        }

        int n1 = nums1.length;
        int result[] = new int[n1];
        for(int i = 0;i<n1;i++){
            result[i] = map.get(nums1[i]);
        }
        return result;
    }
}