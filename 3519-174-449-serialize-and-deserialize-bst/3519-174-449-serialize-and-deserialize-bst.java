public class Codec {

   
    public String serialize(TreeNode root) {
        StringBuilder sd = new StringBuilder();
        serializeHelper(root, sd);
        return sd.toString();
    }
    
    private void serializeHelper(TreeNode root, StringBuilder sd) {
        if (root == null) {
            sd.append("null,"); 
            return;
        }
        sd.append(root.val).append(","); 
        serializeHelper(root.left, sd);
        serializeHelper(root.right, sd);
    }

  
    public TreeNode deserialize(String data) {
        String[] values = data.split(","); 
        Queue<String> queue = new LinkedList<>(Arrays.asList(values));
        return deserializeHelper(queue);
    }
    
    private TreeNode deserializeHelper(Queue<String> queue) {
        String value = queue.poll(); 
        if (value.equals("null")) {
            return null; 
        }
        TreeNode node = new TreeNode(Integer.parseInt(value));
        node.left = deserializeHelper(queue);  
        node.right = deserializeHelper(queue); 
        return node;
    }
}


// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;