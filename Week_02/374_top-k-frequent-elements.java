class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i,  map.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry:map.entrySet()){
            pq.add(entry);
        }
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = pq.poll().getKey();
        }
        return arr;
    }
}
