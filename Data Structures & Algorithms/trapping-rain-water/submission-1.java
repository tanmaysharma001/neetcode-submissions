class Solution {
    public int trap(int[] height) {
        int water = 0;

        for(int i=0;i<height.length;i++){

            int maxLeft=0;
            int maxRight=0;

            // scan left
            for(int j=0;j<=i;j++){
                maxLeft=Math.max(maxLeft,height[j]);
            }

            // scan right
            for(int j=i;j<height.length;j++){
                maxRight=Math.max(maxRight,height[j]);
            }

            water +=
            Math.min(maxLeft,maxRight)
            - height[i];
        }

        return water;
    }
}
