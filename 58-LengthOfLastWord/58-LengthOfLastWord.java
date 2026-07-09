// Last updated: 09/07/2026, 10:10:26
class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int count = 0;
        while(i>=0 && s.charAt(i) == ' '){
            i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            count += 1;
            i--;
        }
        return count;
    }
}