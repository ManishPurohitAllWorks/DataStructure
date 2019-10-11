package linkedlist;

public class ReverseLinkedList {

    void printList(ListNode node)
    {
        while (node != null)
        {
            System.out.println(node.val);
            node=node.next;
        }

    }

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;
        ListNode next ;
        while (curr!=null)
        {
            next =curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

    return  prev;

    }

    public static void main(String args[])
    {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode head = new ListNode(5);
        head.next =new ListNode(10);
        head.next.next = new ListNode(15);

        reverseLinkedList.printList(reverseLinkedList.reverseList(head));

    }
}
