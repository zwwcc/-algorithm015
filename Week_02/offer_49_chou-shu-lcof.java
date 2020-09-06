class Solution {
    public int nthUglyNumber(int n) {
        if(n <= 0) {
            return -1;
        }
        PriorityQueue<Long> pq = new PriorityQueue<>();
        int[] arr = new int[]{2,3,5};
        int index = 1;
        pq.add(1L);
        while(true){
            long val = pq.poll();
            if (index++ >= n) {
                return (int)val;
            }
            for(int i : arr) {
                if (!pq.contains(val * i)) {
                    pq.add(val * i);
                }
            }
        }
    }
}
