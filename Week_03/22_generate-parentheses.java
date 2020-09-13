class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        gen(0, 0, n, list, "");
        return list;
    }
    public void gen(int left, int right, int n, List<String> list, String s) {
        if (left == n && right == n) {
            list.add(s);
        }
        if (left < n) {
            gen(left+1, right, n, list,s+"(");
        }
        if (right < left) {
            gen(left, right + 1, n, list,s+")");
        }
    }
}
