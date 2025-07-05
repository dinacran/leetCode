import component.ListNode;
import utils.LinkedListUtils;

void main(){

    LinkedListUtils.printListNode(LinkedListUtils.generateListNodeFromArray(new int[]{2,4,3}));

    // System.out.println(addTwoNumbers(generateListNode(new int[]{2,4,3}), generateListNode(new int[]{5,6,4})));

}

public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    long num1 = 0;

    while(l1 != null){
        if(num1 == 0){
            num1 = num1 + l1.val;
            l1 = l1.next;
        }else{
            num1 = (num1*10) + l1.val;
            l1 = l1.next;

        }
    }

    long num2 = 0;

    while(l2 != null){
        if(num2 == 0){
            num2 = num2 + l2.val;
            l2 = l2.next;
        }else{
            num2 = (num2*10) + l2.val;
            l2 = l2.next;
        }
    }

    long revNum = Long.parseLong(reverse((num1 + num2) + ""));
    long revNum2 = Long.parseLong(reverse(num2 + ""));
    return generateList(revNum);
        
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

private String reverse(String s) {

    if(s.length() < 2) return s;

    return reverse(s.substring(s.length()/2, s.length())) + reverse(s.substring(0, s.length()/2));
}

