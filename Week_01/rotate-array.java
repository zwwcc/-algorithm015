class Solution {
    // 暴力
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        for (int i = 0; i < k; i++) {
            int tmp = nums[0];
            for (int j = 1 ; j < len; j++) {
                    int tmp1 = nums[j];
                    nums[j] = tmp;
                    tmp = tmp1;
            }
            nums[0] = tmp;
        }
    }
}

class Solution1 {
    // 旋转
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int index = k % len;
        reverse(nums, 0, len - 1);
        reverse(nums, 0, index - 1 );
        reverse(nums, index, len -1);
    }
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start ++] = nums[end];
            nums[end --] = tmp;
        }
    }
}