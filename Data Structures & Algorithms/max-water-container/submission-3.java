class Solution {
    public int maxArea(int[] heights) {

        int n = heights.length;
        int left = 0;
        int right = n-1;
        int maxWater = 0;

        for(int i=0; i<n; i++){
            
            int width = right - left;
            int height = Math.min(heights[left], heights[right]);

            int area = height * width;
            maxWater = Math.max(maxWater, area);

            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxWater;
    }
}
