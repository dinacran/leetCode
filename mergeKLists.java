/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class mergeKLists {
    public ListNode mergeKList(ListNode[] lists) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for(ListNode ln : lists){
            ListNode temp = ln;
            while(temp!=null){
            arrList.add(temp.val);
            temp = temp.next;
            }
        }
        arrList.sort(null);
        LinkedList1 list = new LinkedList1();
        for(int a : arrList) list.add(a);
        ListNode node = list.returnNode();
        return node;
    }
}

  class LinkedList1{
    ListNode list;
    public void add(int val){
    ListNode newNode = new ListNode(val);
    if(list==null)
        list = newNode;
    else{
        ListNode temp = list;
        while(temp.next!=null) temp = temp.next;
        temp.next = newNode;
    }}
    public ListNode returnNode(){
    return list;
}
    }
    
