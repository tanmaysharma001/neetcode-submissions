class Solution {
    public int largestRectangleArea(int[] heights) {

        int maxArea = 0;
        int n = heights.length;

        for(int i=0;i<n;i++){

            int left=i;
            int right=i;

            while(left>0 && heights[left-1]>=heights[i]){
                left--;
            }

            while(right<n-1 && heights[right+1]>=heights[i]){
                right++;
            }

            int width=right-left+1;

            int area=heights[i]*width;

            maxArea=Math.max(maxArea,area);
        }

        return maxArea;
    }
}