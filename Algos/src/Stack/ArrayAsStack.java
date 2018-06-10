package Stack;

public class ArrayAsStack {
    static int top;
    static int MAX=100;
    static int [] stack=new int[MAX];
    public static void main(String[] args) {
        top=-1;
        push(20);
        push(10);
        System.out.println(pop());
    }
    public static void push(int x)
    {
        if (top>MAX)
        {
            System.out.println("Overflow");
            return;
        }
        stack[++top]=x;
    }
    public static int pop()
    {
        if (top<0)
        {
            System.out.println("Underflow");
            return -1;
        }
        return stack[top--];

    }
}
