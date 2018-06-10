package LinkedList;

public class Delete {
    public static void main(String[] args) {
        Node head=new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);


        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        LinkedList.Node n= head;
        int pos=2;
        int curr=0;
        while (curr!=pos-1)
        {
            n=n.next;
            curr++;
        }
        n.next=n.next.next;
        LinkedList.Node temp= head;
        while (temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }

    }
}
