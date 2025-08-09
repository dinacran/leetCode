import java.util.Stack;

import component.TreeNode;
import utils.BinaryTreeUtils;

void main() {

    System.out.println(kthSmallest(BinaryTreeUtils.getBinaryTree(new Integer[] { 5, 3, 6, 2, 4, null, null, 1 }), 6));
    System.out.println(kthSmallest(BinaryTreeUtils.getBinaryTree(new Integer[] { 5, 3, 6, 2, 4, null, null, 1 }), 3));

}

public int kthSmallest(TreeNode root, int k) {

    Stack<TreeNode> stack = new Stack<>();

    TreeNode ptr = root;
    int count = 0;

    while (ptr != null || !stack.isEmpty()) {

        if (ptr != null) {
            stack.push(ptr);
            ptr = ptr.left;
        } else {
            ptr = stack.pop();
            count++;
            if (count == k)
                return ptr.val;
            ptr = ptr.right;
        }
    }

    return Integer.MIN_VALUE;

}