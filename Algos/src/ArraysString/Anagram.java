package ArraysString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    public static void main(String args[])
    {
       String str1="aks";
       String str2="kas";
       str1.toLowerCase();
       str2.toLowerCase();
       char [] a=str1.toCharArray();
       char [] b=str2.toCharArray();
        List <char[]> resultList=sort(a,b);
        a=resultList.get(0);
        b=resultList.get(1);
        for (int i = 0; i < a.length;  i++)
            if (a[i] != b[i])
                System.out.println(false);

        else
                System.out.println(true);


    }
    public static List sort(char a[], char[] b)
    {
        List <char[]> resultList=new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        resultList.add(a);
        resultList.add(b);
        return resultList;
    }
}
