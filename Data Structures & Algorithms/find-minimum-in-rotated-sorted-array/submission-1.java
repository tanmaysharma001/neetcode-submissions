class Solution {
    public int findMin(int[] nums) {

        int least = nums[0];

        for(int num : nums){
            least = Math.min(least, num);
        }

        return least;
    }
}
