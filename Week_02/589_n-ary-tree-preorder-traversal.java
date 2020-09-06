/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList();
        getNode(root, list);
        return list;
    }
    public void getNode(Node node, List<Integer> list) {
        if (node == null ){
            return ;
        }
        list.add(node.val);
        for(Node item :node.children) {
            getNode(item, list);
        }
    }
}
