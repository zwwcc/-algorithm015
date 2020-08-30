// 一次ac
class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int index = 0;
        int tmp = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            if (tmp < nums[i]){
                nums[index ++] = nums[i];
                tmp = nums[i];
            }
        }
        return index;
    }
}