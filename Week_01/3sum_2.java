class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return arr;
        }
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < len - 2 ; i++) {
            // 如果第一个元素大于0 直接return
            if (nums[i] > 0) break;
            // 去重
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            // 双指针
            int left = i + 1;
            int right = len - 1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    arr.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // 去重
                    while(left < right && nums[right] == nums[right - 1]) right--;
                    while(left < right && nums[left] == nums[left + 1]) left++;
                    right--;left++;
                }else{
                    if (sum < 0 ){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return arr;
    }
}