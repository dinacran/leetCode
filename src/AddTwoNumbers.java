import component.ListNode;
import utils.LinkedListUtils;

void main(){

    LinkedListUtils.printListNode(LinkedListUtils.generateListNodeFromArray(new int[]{2,4,3}));

    System.out.println(addTwoNumbers(generateList(9), generateList(1999999999)));
}


public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    long digit1 = extractDigit(l1);
    long digit2 = extractDigit(l2);

    System.out.println(digit1 + " " + digit2);

    digit1 = rev(digit1);
    digit2 = rev(digit2);

    System.out.println(digit1 + " " + digit2);

    

   return generateList(rev(digit1 + digit2));
        
}

public long extractDigit(ListNode node){
    long num = 0;
    int multiplier = 1;
    while(node != null){
        num += node.val * multiplier;
        node = node.next;
        multiplier *= 10;
    }

    return num;
}

private ListNode generateList(long num) {

    ListNode root = new ListNode((int)num % 10);
    ListNode current = root;

    num /= 10;
    while(num > 0){
        current.next = new ListNode((int)num % 10);
        current = current.next;
        num /= 10;
    }

    return root;
}

public long rev(long num) {

    long result = 0;
    while(num > 0) {
        result = result * 10 + num % 10;
        num /= 10;
    }
    return result;
}

