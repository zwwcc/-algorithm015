class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        if (len == 0 || k == 0) {
            return nums;
        }
        Deque<Integer> dq = new ArrayDeque<>();
        int[] arr = new int[len - k + 1];
        int index = 0;
        for(int i = 0; i < len; i++ ) {
            if (i - k  >= 0 && !dq.isEmpty() && dq.peekFirst() == nums[i - k]) {
               dq.pollFirst();
            }
            while (!dq.isEmpty() && dq.peekLast() < nums[i]) {
                dq.pollLast();
            }
            dq.addLast(nums[i]);
            if (i + 1 >= k) {
                arr[index ++] = dq.peekFirst();
            }
        }
        return arr;
    }
}
