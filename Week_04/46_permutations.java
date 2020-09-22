class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (0 == len) {
            return res;
        }
        List<Integer> path = new ArrayList<>();
        boolean[] used = new boolean[len];
        dfs(nums, len, 0, path, used, res);
        return res;
    }

    private void dfs(int[] nums, int len, int index, List<Integer> path, boolean[] used, List<List<Integer>> res) {
        if (index == len) {
            res.add(new ArrayList<>(path));
            return ;
        }
        for (int i = 0; i < len; i++) {
            if (used[i]) {
                continue;
            }
            path.add(nums[i]);
            used[i] = true;
            dfs(nums, len, index + 1, path, used, res);
            int val = path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}
