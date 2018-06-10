package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int a[]=new int[]{5,4,3,2,1};
        insert(a);

    }
    public static void insert(int []a)
    {
        int n=a.length;
        for (int i=0;i<n;i++)
        {
            int iMin=i;
            for (int j=i+1;j<n;j++) {
                if (a[j] < a[iMin]) {
                    iMin = j;
                }
            }
            int temp=a[i];
            a[i]=a[iMin];
            a[iMin]=temp;
        }
        print(a,n);
    }
    public static void print(int a[],int n)
    {
        System.out.println();
        for(int i=0;i<n;i++)
            System.out.print(a[i]+"\t");
    }
}
