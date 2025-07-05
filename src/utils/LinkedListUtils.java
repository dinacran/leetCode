package utils;

import component.ListNode;

public class LinkedListUtils {

    public static ListNode generateListNodeFromArray(int[] nums) {
        if (nums == null || nums.length == 0) return null;

        ListNode root = new ListNode(nums[0]);
        ListNode current = root;

        for (int i = 1; i < nums.length; i++) {
            current.next = new ListNode(nums[i]);
            current = current.next;
        }

        return root;

    }

    
    public static void printListNode(ListNode root) {
        while (root != null) {
            System.out.print(root.val + " ");
            root = root.next;
        }
        System.out.println();
    }

    public static ListNode generateListBySplitingNum(int num) {

        char[] nums =  Integer.toString(num).toCharArray();
    
        ListNode root = new ListNode(nums[0] - '0');
        ListNode current = root;
    
        for (int i = 1; i < nums.length; i++) {
            current.next = new ListNode(nums[i] - '0');
            current = current.next;
        }
    
        return root;
    
    }
}
