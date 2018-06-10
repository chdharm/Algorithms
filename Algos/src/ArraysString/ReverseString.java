package ArraysString;

import java.util.HashMap;
import java.util.Map;

public class ReverseString {
    public static void main(String args[])
    {
        StringBuilder res=new StringBuilder();
        String str1="Akshay";
        String [] arr=new String [128];
        arr=str1.split(" ");
        for (int i=0,j=arr.length-1;i<arr.length/2;i++,j--)
        {
            swap(arr,i,j);
        }

        for (String word:arr)
        {
            res.append(word).append(" ");
        }
        System.out.print(res);
    }
    public static void swap(String a[],int i,int j)
    {
        String temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
