import java.util.LinkedList;
import java.util.Queue;

import component.TreeNode;

void main(){

    System.out.println(lcaDeepestLeaves(buildTree(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4})).val);

}

public TreeNode lcaDeepestLeaves(TreeNode root) {
    if (root == null) {
        return null;
    }

    if (root.left == null && root.right == null) {
        return root;
    }

    int maxDepth = -1;
    TreeNode deepestNode = null;
    TreeNode parent = null;

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
        int levelSize = queue.size();
        maxDepth++;

        for (int i = 0; i < levelSize; i++) {
            TreeNode node = queue.poll();

            if (node.left != null) {
                queue.add(node.left);
                if (maxDepth + 1 > maxDepth) {
                    deepestNode = node.left;
                    parent = node;
                }
            }
            if (node.right != null) {
                queue.add(node.right);
                if (maxDepth + 1 > maxDepth) {
                    deepestNode = node.right;
                    parent = node;
                }
            }
        }
    }

    if (parent != null && (parent.left != null && parent.right != null)) {
        return parent;
    } else {
        return deepestNode;
    }
}public static TreeNode buildTree(Integer[] values) {
    if (values == null || values.length == 0) {
        return null;
    }

    TreeNode root = new TreeNode(values[0]);
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    int i = 1;
    while (i < values.length) {
        TreeNode current = queue.poll();

        // Add left child
        if (values[i] != null) {
            current.left = new TreeNode(values[i]);
            queue.add(current.left);
        }
        i++;

        // Add right child
        if (i < values.length && values[i] != null) {
            current.right = new TreeNode(values[i]);
            queue.add(current.right);
        }
        i++;
    }

    return root;
}
