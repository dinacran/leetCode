
//https://leetcode.com/problems/lowest-common-ancestor-of-deepest-leaves

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import component.TreeNode;

void main() {

    List<Integer> values = List.of(3, 5, 1, 6, 2, 0, 8, 2, 3, 7, 4);
    TreeNode root = new TreeNode(values.get(0));
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    for (int i = 1; i < values.size(); i += 2) {
        TreeNode current = queue.poll();
        if (i < values.size()) {
            current.left = new TreeNode(values.get(i));
            queue.add(current.left);
        }
        if (i + 1 < values.size()) {
            current.right = new TreeNode(values.get(i + 1));
            queue.add(current.right);
        }
    }

    System.out.println(lcaDeepestLeaves(root).val);

}

public TreeNode lcaDeepestLeaves(TreeNode root) {

    TreeNode temp = root;
    ArrayList<TreeNode> list = new ArrayList<>();
    list.add(temp);
    int maxDepth = 0;
    int tempCount = 0;
    TreeNode deepestNode = temp;

    while (true) {
        if (temp == null || (temp.left == null && temp.right == null)) {
            if (tempCount > maxDepth) {
                maxDepth = tempCount;
                if (list.get(list.size() - 1).right != null) {
                    deepestNode = list.get(list.size() - 2);
                } else {
                    deepestNode = temp;
                }
            }
            list.remove(list.size() - 1);
            tempCount--;
            if (list.isEmpty())
                break;
            temp = list.get(list.size() - 1).right;
            list.add(temp);

            list.remove(list.size() - 2);
            tempCount--;
        }
        if (list.isEmpty())
            break;
        if (temp == null || (temp.left == null && temp.right == null)) {
            if (tempCount > maxDepth) {
                if (list.get(list.size() - 1).right != null) {
                    deepestNode = list.get(list.size() - 2);
                } else {
                    deepestNode = temp;
                }
            }
            continue;
        }
        temp = list.get(list.size() - 1).left;

        tempCount++;
        list.add(temp);

    }

    return deepestNode;
}
