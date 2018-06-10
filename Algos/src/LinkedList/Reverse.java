package LinkedList;

public class Reverse {
    public static void main(String[] args) {
        Node head=new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(5);
        Node seventh = new Node(5);

        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=seventh;


        reverse(head);
    }

    public static void reverse(Node head)
    {
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        while(prev!=null)
        {
            System.out.println(prev.data);
            prev=prev.next;
        }
    }

}
