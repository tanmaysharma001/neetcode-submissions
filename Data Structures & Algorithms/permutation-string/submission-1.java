class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        HashMap<Character, Integer> map1 = new HashMap<>();

        for(int i=0; i<s1.length(); i++){
            char c = s1.charAt(i);
            map1.put(c, map1.getOrDefault(c,0)+1);
        }

        for(int i=0; i<=s2.length()-s1.length(); i++){
            HashMap<Character, Integer> map2 = new HashMap<>();

            for(int j= i; j<i+s1.length(); j++){
                char c = s2.charAt(j);
                map2.put(c, map2.getOrDefault(c,0)+1);
            }

            if(map1.equals(map2))
                return true;
        }
        return false;
    }
}
