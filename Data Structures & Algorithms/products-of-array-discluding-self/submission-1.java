class Solution {

    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int[] res = new int[n];

        int product = 1;
        int zeroCount = 0;

        // Calculate product of non-zero elements
        for(int num : nums) {

            if(num == 0) {
                zeroCount++;
            } else {
                product *= num;
            }
        }

        for(int i = 0; i < n; i++) {

            // More than one zero
            if(zeroCount > 1) {
                res[i] = 0;
            }

            // Exactly one zero
            else if(zeroCount == 1) {

                if(nums[i] == 0) {
                    res[i] = product;
                } else {
                    res[i] = 0;
                }
            }

            // No zeros
            else {
                res[i] = product / nums[i];
            }
        }

        return res;
    }
}