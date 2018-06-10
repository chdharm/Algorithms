package ArraysString;

public class Suffix {

    public static void main(String args[])
    {
        String str1="Akshay";
        String str2="Aks";
        int n1=str1.length();
        int n2=str2.length();
        for (int i=n1;i>=0;i--)
        {
            if (str1.equals(str2)) {
                System.out.print(true);
                return;
            }
            System.out.println(str1);
            str1=str1.substring(0,i);
        }
        System.out.print(false);
    }
}
