package StreamOnline;

public class Top5 {
    public static void main(String[] args)
    {
        int arr[] = { 10,5, 20, 30, 40, 50, 60, 10,20,10,20,30,10,10,10,10,20,20,20,20,20 };
        int n = arr.length;
        findFive(arr, n);
    }

    private static void findFive(int[] arr, int n) {
        int max1=0,max2=0,max3=0,max4=0,max5=0;
        for (int i=0;i<n;i++)
        {
            if (max1<arr[i]) {
                max5=max4;
                max4=max3;
                max3=max2;
                max2=max1;
                max1 = arr[i];
            }
           else if (max2<arr[i]) {
                max5=max4;
                max4=max3;
                max3=max2;
                max2 = arr[i];
            }
            else if (max3<arr[i]) {
                max5=max4;
                max4=max3;
                max3 = arr[i];
            }
            else if (max4<arr[i]) {
                max5=max4;
                max4 = arr[i];
            }
            else if (max5<arr[i])
                max5=arr[i];
            else
                continue;
            printLarge(i,max1,max2,max3,max4,max5);
        }
    }

    private static void printLarge(int i,int max1, int max2, int max3, int max4, int max5) {
        System.out.println("After iteration "+i);
        System.out.println("  max1--->"+max1+"   max2--->"+max2+"  max3--->"+max3+"  max4--->"+max4+"  max5--->"+max5);
    }
}
