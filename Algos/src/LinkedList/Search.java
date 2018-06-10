package LinkedList;

public class Search {
    public static void main(String[] args) {
        Node head=new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        int x=3;

        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        getRecursiveSerach(head,x);
    }
    public static void getRecursiveSerach(Node head,int x)
    {
        if (head==null) {
            System.out.println("No matching value");
            return;
        }
        if(head.data==x) {
            System.out.println(head + "--->" + head.data);
            return;
        }
        getRecursiveSerach(head.next,x);


    }
}
