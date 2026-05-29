class Solution {
    public int characterReplacement(String s, int k) {

        int maxLength = 0;

        for(int i=0; i<s.length(); i++){
            HashMap<Character, Integer> map = new HashMap<>();
            
            for(int j=i; j<s.length(); j++){

                char c = s.charAt(j);
                map.put(c, map.getOrDefault(c,0)+1);

                int maxFreq = 0;
                for(int freq : map.values()){
                    maxFreq = Math.max(maxFreq, freq);
                }

                int windowSize = j - i + 1;

                int replacementsNeeded = windowSize - maxFreq;

                if(replacementsNeeded<=k){
                    maxLength = Math.max(maxLength, windowSize);
                }
            }
        }
        return maxLength;
    }
}
