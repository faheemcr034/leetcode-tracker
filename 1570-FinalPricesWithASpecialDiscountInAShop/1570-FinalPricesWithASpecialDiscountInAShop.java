// Last updated: 09/07/2026, 10:06:47
class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> s = new Stack<>();
        int n = prices.length;
        for(int i = n-1;i>=0;i--){
            int cur = prices[i];
            while(!s.isEmpty() && s.peek() > cur){
                
                s.pop();

            }
            if(!s.isEmpty()) {
                prices[i] = prices[i] - s.peek();
            }
            s.push(cur);
        }
        return prices;
    }
}