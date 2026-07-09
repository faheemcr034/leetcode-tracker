// Last updated: 09/07/2026, 10:06:55
class Solution {
    public int heightChecker(int[] heights) {
        int[] old = heights.clone();
        for(int i = 1; i<heights.length;i++){
            int key = heights[i];
            int j = i - 1;
            while(j>=0 && heights[j]>key){
                heights[j+1] = heights[j];
                j--;
            }
            heights[j+1] = key;
        }
        int count=0;
        for(int a = 0;a<heights.length;a++){
            if(heights[a]!=old[a]){
                count++;
            }
        }
        return count;
    }
}