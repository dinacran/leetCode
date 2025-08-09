package utils;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeUtils {

    public static component.TreeNode getBinaryTree(Integer... nums){
        if(nums == null || nums.length == 0) return null;
        
        component.TreeNode root = new component.TreeNode(nums[0]);
        Queue<component.TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        for(int i = 1; i < nums.length; i++){
            component.TreeNode node = queue.poll();
            if(nums[i] != null){
                node.left = new component.TreeNode(nums[i]);
                queue.add(node.left);
            }
            i++;
            if(i < nums.length && nums[i] != null){
                node.right = new component.TreeNode(nums[i]);
                queue.add(node.right);
            }
        }
        
        return root;
    }
    
}
