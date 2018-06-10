package LinkedList;

import java.util.HashSet;

public class DetectLoop {

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
        seventh.next=head;
        System.out.println(HasLoop(head));
    }

    public static boolean HasLoop(Node head)
    {
        HashSet<Node> resSet=new HashSet<>();
        while(head!=null)
        {
            if(resSet.contains(head))
                return true;
            resSet.add(head);
            head=head.next;
        }
        return false;
    }

}
