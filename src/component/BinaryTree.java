package component;

public class BinaryTree {

    public TreeNode root;

    public void insert(int val){
        root = insRec(root, val);
    }

    private TreeNode insRec(TreeNode root, int val){

        if(root == null)
            return new TreeNode(val);
        else if(root.val > val)
            root.left = insRec(root.left, val);
        else if(root.val < val)
            root.right = insRec(root.right, val);

        return root;

    }
    
}
