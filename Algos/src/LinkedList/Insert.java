package LinkedList;

public class Insert {
    public static void main(String[] args) {
        Node first =new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        Node head=first;

        head.next=second;
        second.next=third;

        LinkedList.Node n= head;
        while (n!=null)
        {
            System.out.println(n.data);
            n=n.next;
        }
    }
}
