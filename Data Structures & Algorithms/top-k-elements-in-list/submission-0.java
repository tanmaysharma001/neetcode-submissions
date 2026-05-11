class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        if (nums.length==1 || ((nums.length == 2 && (nums[0] == nums[1]))))
            return new int []{nums[0]};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a, b) -> a[1] - b[1]);

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){

            int number = entry.getKey();
            int frequency = entry.getValue();

            pq.add(new int[]{number, frequency});

            if(pq.size()>k)
                pq.poll();
        }

        int result[] = new int[k];
        for(int i=0; i<k; i++){
            result[i] = pq.poll()[0];
        }

        return result;

        
    }
}
