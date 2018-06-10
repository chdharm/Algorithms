package Stack;

import java.util.Stack;

public class QueueUsingStacks {
    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();

        //s1 is less computation

        enqueue(10,s1,s2);
        enqueue(20,s1,s2);
        enqueue(30,s1,s2);
        System.out.println(dequeue(s1,s2));
        System.out.println(s2);

    }

    public static void enqueue(int x,Stack s1,Stack s2)
    {
        s1.push(x);
    }
    public static int dequeue(Stack s1,Stack s2)
    {
        while (!s1.isEmpty())
        {
            int n= (int) s1.pop();
            s2.push(n);
        }
        return (int)s2.pop();
    }

}
