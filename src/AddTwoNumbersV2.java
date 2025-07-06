// https://leetcode.com/problems/add-two-numbers/

import component.ListNode;

void main() {

    System.out.println(extractDigit(addTwoNumbers(generateList(9999999), generateList(9999))));
}

public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    ListNode resultNode = null, ptr = null;

    long remainder = 0;

    while (l1 != null && l2 != null) {

        long sum = l1.val + l2.val + remainder;

        remainder = sum > 9 ? 1 : 0;

        ListNode temp = new ListNode((int)(sum % 10));
        if (resultNode == null) {
            resultNode = temp;
            ptr = resultNode;
        }
        else {
            ptr.next = temp;
            ptr = ptr.next;
        }
        l1 = l1.next;
        l2 = l2.next;
    }

    while (l1 != null) {
        long sum = l1.val + remainder;

        remainder = sum > 9 ? 1 : 0;

        ptr.next = new ListNode((int)(sum % 10));
        ptr = ptr.next;

        l1 = l1.next;
    }

    while (l2 != null) {
        long sum = l2.val + remainder;

        remainder = sum > 9 ? 1 : 0;

        ptr.next = new ListNode((int)(sum % 10));
        ptr = ptr.next;

        l2 = l2.next;

    }

    if(remainder != 0)
        ptr.next = new ListNode((int)remainder);

    return resultNode;

}

public long extractDigit(ListNode node) {
    long num = 0;
    int multiplier = 1;
    while (node != null) {
        num += node.val * multiplier;
        node = node.next;
        multiplier *= 10;
    }

    return num;
}

private ListNode generateList(long num) {

    ListNode root = new ListNode((int) (num % 10));
    ListNode current = root;

    num /= 10;
    while (num > 0) {
        current.next = new ListNode((int) (num % 10));
        current = current.next;
        num /= 10;
    }

    return root;
}
