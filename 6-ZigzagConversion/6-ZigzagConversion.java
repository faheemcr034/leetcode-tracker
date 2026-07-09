// Last updated: 09/07/2026, 10:11:19
class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i =0 ;i<numRows;i++){
            rows[i] = new StringBuilder();
        }
        int curRow = 0;
        boolean movingdown = false;
        
        for(char c : s.toCharArray()){
            rows[curRow].append(c);
            if(curRow == 0 || curRow == numRows-1){
                movingdown = !movingdown;
            }
            curRow += movingdown ? 1:-1;
        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder row : rows){
            result.append(row);
        }
        return result.toString();
    }
}