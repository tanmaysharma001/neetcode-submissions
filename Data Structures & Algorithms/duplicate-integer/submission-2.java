class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        if(nums.length == 1 || nums == null)
            return false;

        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i]))
                return true;
            else
                set.add(nums[i]);
        }

        return false;

    }
}