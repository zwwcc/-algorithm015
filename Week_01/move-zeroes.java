class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        int len = nums.length;
        for (int i = 0; i < len ;i++) {
            if (nums[i] != 0){
                nums[index ++] = nums[i];
            }
        }
        for (int i = index; i < len; i++) {
            nums[i] = 0;
        }
    }
}

// 一次遍历
class Solution1 {
    public void moveZeroes(int[] nums) {
        int index = 0;
        int len = nums.length;
        for (int i = 0; i < len ;i++) {
            if (nums[i] != 0){
                int tmp = nums[i];
                nums[i] = nums[index];
                nums[index] = tmp;
                index++;
            }
        }

    }
}