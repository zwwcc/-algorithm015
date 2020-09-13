/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// 递归
class Solution {
    public boolean isValidBST(TreeNode root) {
        return bst(root, null, null);
    }
    public boolean bst(TreeNode root, Integer lower, Integer height) {
        if (null == root) {
            return true;
        }
        if (lower != null && root.val <= lower ) return false;
        if (height != null && root.val >= height ) return false;
        return bst(root.left, lower, root.val) && bst(root.right, root.val, height);
    }
}
// 中序遍历
class Solution1 {
    long min = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if (null == root) {
            return true;
        }
        if (!isValidBST(root.left)){
            return false;
        }
        if (root.val <= min){
            System.out.println(min);
            return false;
        } 
        min = root.val;
        return isValidBST(root.right);
    }
}
