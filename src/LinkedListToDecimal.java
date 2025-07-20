// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer

import component.ListNode;
import utils.LinkedListUtils;

void main() {

    // System.out.println(0 << 1);

    System.out.println(getDecimalValue(LinkedListUtils.generateListNodeFromArray(new int[]{1,0,1})));

}

    public int getDecimalValue(ListNode head) {

        int ans = 0;

        while(head != null){

            ans = (ans << 1) | head.val;

            head = head.next;
            
        }

        return ans;
        
    }