// Last updated: 09/07/2026, 10:09:10
class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for(int i = 0;i < columnTitle.length();i++){
            char ch = columnTitle.charAt(i);
            int value = (int) ch - (int) 'A' + 1;  
            result = result*26 + value;
        }
        return result;
    }
}