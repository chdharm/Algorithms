package StreamOnline;

/**
* Given a stream of numbers, print average (or mean) of the stream at every point. For example,
 * let us consider the stream as 10, 20, 30, 40, 50, 60, …

 Average of 1 numbers is 10.00
 Average of 2 numbers is 15.00
 Average of 3 numbers is 20.00
 Average of 4 numbers is 25.00
 Average of 5 numbers is 30.00
 Average of 6 numbers is 35.00
*
* */
public class Average {
    public static void main(String[] args)
    {
        float arr[] = { 10, 20, 30, 40, 50, 60 };
        int n = arr.length;
        streamAvg(arr, n);
    }

    private static void streamAvg(float[] arr, int n) {
        float avg=0.0f;
        for (int i=0;i<n;i++)
        {
            avg=calcAvg(avg,arr[i],i);
            System.out.println(avg);
        }
    }

    private static float calcAvg(float avg, float v, int i) {
        return ((avg*i+v)/(i+1));
    }

}
