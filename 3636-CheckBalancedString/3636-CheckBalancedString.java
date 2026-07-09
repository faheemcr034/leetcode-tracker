// Last updated: 09/07/2026, 10:06:29
class Solution {
    public boolean isBalanced(String num) {
        int odd_sum = 0;
        int even_sum = 0;
        for(int i = 0;i<num.length();i++){
            int val = num.charAt(i) - '0';
            if(i%2!=0){
                odd_sum += val;
            }
            else{
                even_sum += val;
            }
        }
        return odd_sum == even_sum;
    }
}