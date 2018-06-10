package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class CountInteger {
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
        Map<Integer,Integer> resMap=countInt(head);
        for (Map.Entry<Integer,Integer> entry:resMap.entrySet())
        {
            System.out.println(entry.getKey()+" ------> "+entry.getValue());
        }
    }
    public static Map<Integer, Integer> countInt(Node head)
    {
        Map<Integer,Integer> resMap=new HashMap<>();
        while (head!=null)
        {
            Integer temp=resMap.get(head.data);
            resMap.put(head.data,(temp==null)?1:temp+1);
            head=head.next;
        }
        return resMap;
    }
}
