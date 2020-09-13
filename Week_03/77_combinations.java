class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList();
        if (n <= 0 && k <= 0 ) {
            return result;
        }
        List<Integer> cur = new ArrayList();
        dfs(n, k, 1, cur, result); 
        return result;
    }

    public void dfs(int n, int k, int index , 
    List<Integer> cur, List<List<Integer>> result) {
        if (cur.size() == k ){
            result.add(new ArrayList(cur));
            return;
        }
        for (int i = index; i <= n - (k - cur.size()) + 1; i++) {
            cur.add(i);    
            dfs(n, k, i + 1, cur, result);
            cur.remove(cur.size() - 1); 
        }
    }
}
