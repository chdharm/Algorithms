package ArraysString;

public class Palindrome {
    public static void main(String args[])
    {
        StringBuilder res=new StringBuilder();
        String str1="Akshay is is Akshay";
        String [] arr=new String [128];
        arr=str1.split(" ");
        for (int i=0,j=arr.length-1;i<arr.length/2;i++,j--)
        {
            if (!isPalin(arr,i,j)) {
                System.out.println("NOT PALIN");
                return;
            }
        }
        System.out.println("PALIN");

    }
    public static boolean isPalin(String a[],int i,int j)
    {
        if (a[i].equals(a[j]))
            return true;
        return false;
    }
}
