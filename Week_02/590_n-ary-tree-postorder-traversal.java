class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList();
        getNode(root, list);
        return list;
    }
    public void getNode(Node node, List<Integer> list) {
        if (node == null) {
            return ;
        }
        for(Node item: node.children) {
            getNode(item, list);
        }
        list.add(node.val);
        
    }
}
