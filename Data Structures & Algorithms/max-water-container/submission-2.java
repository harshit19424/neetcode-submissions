class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;

        int maxArea = 0;
        while(i < j){
            int currArea = Math.min(heights[i], heights[j]) * (j - i);
            if(heights[i] < heights[j]){
                i++;
            }
            else{
                j--;
            }
            maxArea = Math.max(currArea, maxArea);
        }
        return maxArea;
    }
}
