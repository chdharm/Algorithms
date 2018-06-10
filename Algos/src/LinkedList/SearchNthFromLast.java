package LinkedList;

public class SearchNthFromLast {
    public static void main(String[] args) {
        Node head=new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        int x=4;

        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        getNth(head,x);
    }
    public static void getNth(Node head,int x)
    {
        Node t1=head;
        Node t2=head;
        int count=0;
        if(head!=null)
        {
            while(count<x)
            {
                if (t2==null)
                    return;
                t2=t2.next;
                count++;
            }
            while (t2!=null)
            {
                t1=t1.next;
                t2=t2.next;
            }
            System.out.println(t1.data);
        }
    }
}
