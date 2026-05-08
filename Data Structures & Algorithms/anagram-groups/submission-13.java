class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs.length==0)
            return new ArrayList<>();

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);

            String sort = new String(arr);

            if(!map.containsKey(sort))
                map.put(sort, new ArrayList<>());
            
            
            map.get(sort).add(str);
        }

        return new ArrayList<>(map.values());

    }
}
