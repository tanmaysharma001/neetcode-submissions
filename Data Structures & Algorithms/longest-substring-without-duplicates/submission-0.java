class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left= 0;
        int right= 0;
        int length= 0;

        Set<Character> set = new HashSet<>();
        
        while(right<s.length()){
            char c= s.charAt(right);

            if(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            else{
                set.add(c);
                length= Math.max(length, right-left+1);
                right++;
            }
        }
        return length;
    }
}
