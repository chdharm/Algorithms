package StreamOnline;

public class LArgest {
    public static void main(String[] args)
    {
        int arr[] = { 10, 20, 30, 40, 50, 60, 10,20,10,20,30 };
        int n = arr.length;
        findLargest(arr, n);
    }

    private static void findLargest(int[] arr, int n) {
        int max=0;
        for (int i=0;i<n;i++)
        {
            if (max<arr[i])
               max=arr[i] ;
            printLarge(max);
        }
    }

    private static void printLarge(int max) {
        System.out.println(max);
    }
}
