/** DFS **/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList();
        if (root == null) {
            return res;
        }
        resOrder(root, 0, res);
        return res;
    }
    public void resOrder(TreeNode root, int level ,List<List<Integer>> res) {
        if (root == null) {
            return ;
        }
        if (res.size() == level) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        resOrder(root.left, level+1, res);
        resOrder(root.right, level+1, res);
    }
}

/** BFS **/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution1 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (null == root) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {   
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node  = queue.poll();
                list.add(node.val);
                if (null != node.left) {
                    queue.add(node.left);
                } 
                
                if (null != node.right) {
                    queue.add(node.right);
                }
            }
            res.add(list);
        }
        return res;
    }
}
