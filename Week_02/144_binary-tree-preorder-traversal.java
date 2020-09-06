class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        getNode(root, list);
        return list;  
    }
    public void getNode(TreeNode node, List<Integer> list) {
        if (node == null) {
            return ;
        }
        list.add(node.val);
        getNode(node.left, list);
        getNode(node.right, list);
    }
}
