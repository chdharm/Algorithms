package Array;
/**
 *An array contains both positive and negative numbers in random order.
 * Rearrange the array elements so that positive and negative numbers are placed alternatively.
 * Number of positive and negative numbers need not be equal.
 * If there are more positive numbers they appear at the end of the array.
 * If there are more negative numbers, they too appear in the end of the array.
 For example, if the input array is [-1, 2, -3, 4, 5, 6, -7, 8, 9], then the output should be [9, -7, 8, -3, 5, -1, 2, 4, 6]
 * */
public class AlternatePosNeg {
    public static void main(String[] args) {
        int [] arr ={-1, 2, -3, 4, 5, 6, -7, 8, 9};
        alter(arr);
    }

    private static void alter(int[] arr) {
        int negCount=0,posCount=0;
        int neg[]=new int[3];
        int pos[]=new int[6];
        for (int i=arr.length-1;i>=0;i--)
        {
            if (arr[i]<0)
            {
                neg[negCount]=arr[i];
                negCount++;
            }
            else {
                pos[posCount]=arr[i];
                posCount++;

            }
        }
        printResult(neg,negCount,pos,posCount,arr.length);
    }

    private static void printResult(int[] neg, int negCount, int[] pos, int posCount, int length) {
    }


}
