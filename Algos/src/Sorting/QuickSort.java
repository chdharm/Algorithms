package Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int a[]=new int[]{5,4,3,2,1};
        int start=0;
        int end=a.length-1;
        a=QuickSort(a,start,end);
        print(a,a.length);
    }

    public static int[] QuickSort(int []a, int start, int end)
    {
        if (start<end)
        {
            int pIndex=Partition(a,start,end);
            QuickSort(a,start,pIndex-1);
            QuickSort(a,pIndex+1,end);
            return a;
        }
        return null;
    }
    public static int Partition(int []a, int start, int end)
    {
        int pivot=a[end];
        int pIndex=start;
        for(int i=start;i<end;i++)
        {
            if (a[i]<=pivot)
            {
                int temp=a[i];
                a[i]=a[pIndex];
                a[pIndex]=temp;
                pIndex++;
            }

        }
        int temp=a[pIndex];
        a[pIndex]=a[end];
        a[end]=temp;
        return pIndex;
    }
    public static void print(int a[],int n)
    {
        System.out.println();
        for(int i=0;i<n;i++)
            System.out.print(a[i]+"\t");
    }

}
