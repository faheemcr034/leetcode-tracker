// Last updated: 09/07/2026, 10:09:07
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n!=1){
            if(!set.contains(n)){
                set.add(n);
            }
            else{
                return false;
            }
            int sum = 0;
            for(int temp = n;temp>0;temp = temp/10){
                int digit = temp%10;
                digit*=digit;
                sum+=digit;
            }
            n = sum;
        }
        return true;
            
    }
}