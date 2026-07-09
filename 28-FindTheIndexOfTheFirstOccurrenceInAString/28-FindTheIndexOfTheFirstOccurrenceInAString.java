// Last updated: 09/07/2026, 10:10:51
class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length(); 

        for(int i = 0;i<=m-n;i++){
            String sub = haystack.substring(i,i+n);
            if(sub.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}