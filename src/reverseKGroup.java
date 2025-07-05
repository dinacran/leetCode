// Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

// k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

// You may not alter the values in the list's nodes, only nodes themselves may be changed.

import java.util.ArrayList;

import component.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class reverseKGroup {
    public ListNode reverseKgroup(ListNode head, int k) {
        ListNode ptr = head;

        ArrayList<Integer> tempList = new ArrayList<>();
        while(ptr != null) {
            tempList.add(ptr.val);
            ptr = ptr.next;
        }

        int n;
        if (k * 2 <= tempList.size())
            n = tempList.size() / k;
        else
            n = 1;
        ArrayList<Integer> arrList = new ArrayList<>();

        for (int temp = k - 1, temp1 = 1; n != 0; temp1++, n--, temp = (temp1 * k) - 1) {

            for (int j = 0; j < k; j++, temp--)
                arrList.add(tempList.get(temp));
            ;
        }
        for (int i = arrList.size(); i < tempList.size(); i++)
            arrList.add(tempList.get(i));

        LinkedList1 newList = new LinkedList1();
        for(int i : arrList) newList.add(i);
        return newList.returnNode();

    }

}

class LinkedList1 {
    ListNode list;

    public void add(int val){
    ListNode newNode = new ListNode(val);
    if(list==null)
        list = newNode;
    else{
        ListNode temp = list;
        while(temp.next!=null) temp = temp.next;
        temp.next = newNode;
    }
    }
    public ListNode returnNode(){
    return list;
    }
    }
