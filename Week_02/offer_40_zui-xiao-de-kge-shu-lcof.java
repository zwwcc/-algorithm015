class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o1-o2);
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int[] nums = new int[k]; 
        for (int i = 0;i < k ;i++){
            nums[i] = pq.poll();
        }
        return nums;
    }
}
