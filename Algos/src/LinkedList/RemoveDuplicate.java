package LinkedList;

public class RemoveDuplicate {
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
        removeDuplicate(head);
    }
    public static void removeDuplicate(Node head)
    {
        Node temp=head;
        while(head.next!=null)
        {
            if (head.data==head.next.data && head.next.next!=null)
            {
                Node next_next;
                next_next=head.next.next;
                head.next=null;
                head.next=next_next;
            }
            head=head.next;
        }


        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
