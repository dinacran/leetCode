//https://leetcode.com/problems/lowest-common-ancestor-of-deepest-leaves

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import component.TreeNode;

void main() {

    System.out.println(lcaDeepestLeaves(buildTree(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4})).val);

}

public TreeNode lcaDeepestLeaves(TreeNode root) {

    TreeNode ptr = root;
    TreeNode deepestNode = root;
    int ptrDepth = 0;
    int maxDepth = 0;
    ArrayList<TreeNode> list = new ArrayList<>();
    list.add(deepestNode);

    while (true) {
        if (list.isEmpty())
            break;

        while (ptr.left != null) {
            ptr = ptr.left;
            list.add(ptr);
            ptrDepth++;
        }

        if (ptrDepth > maxDepth) {
            maxDepth = ptrDepth;
            deepestNode = ptr;
        }
        if (ptr.right == null) {
            list.removeLast();
            ptrDepth--;

            if (list.isEmpty())
                break;

            ptr = list.getLast().right;
        } else {
            ptr = ptr.right;
        }
    }

    // Return the parent of the deepest node
    return findParent(root, deepestNode);
}

// Helper method to find the parent of a node
public TreeNode findParent(TreeNode root, TreeNode node) {
    if (root == null) return null;
    if (root.left == node || root.right == node) return root;
    TreeNode left = findParent(root.left, node);
    if (left != null) return left;
    return findParent(root.right, node);
}
public static TreeNode buildTree(Integer[] values) {
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
