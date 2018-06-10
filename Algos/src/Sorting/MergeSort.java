package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int a[]=new int[]{5,4,3,2,1};
        a=MergeSort(a,a.length);
        print(a,a.length);

    }

    public static int[] MergeSort(int a[],int n)
    {
        if(n<=1)
            return null;
        int mid=n/2;
        int left[]=new int[mid];
        int right[]=new int[n-mid];
        for(int i=0;i<mid;i++)
            left[i]=a[i];
        for(int i=mid;i<n;i++)
            right[i-mid]=a[i];
        MergeSort(left,mid);
        MergeSort(right,n-mid);
        Merge(left,right,a);
        return a;

    }
    public static void Merge(int left[],int right[],int a[])
    {
        int n=a.length;
        int nL=left.length;
        int nR=right.length;
        int i,j,k;
        i=j=k=0;
        while(i<nL &&j!=nR)
        {
            if (left[i]<=right[j])
            {
                a[k]=left[i];
                i++;
                k++;
            }
            else
            {
                a[k]=right[j];
                j++;
                k++;
            }
        }
        while (i<nL)
        {
            a[k]=left[i];
            i++;
            k++;
        }
        while (j<nR)
        {
            a[k]=right[j];
            j++;
            k++;
        }
    }

    public static void print(int a[],int n)
    {
        System.out.println();
        for(int i=0;i<n;i++)
            System.out.print(a[i]+"\t");
    }
}
