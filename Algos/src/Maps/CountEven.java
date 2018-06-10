package Maps;

import java.util.HashMap;
import java.util.Map;

public class CountEven {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 1, 6 };
        int n = arr.length;
        System.out.println(firstEven(arr, n));
    }
    public static int firstEven(int arr[], int n)
    {
        HashMap<Integer, Boolean> map =
                new HashMap<Integer, Boolean>();
        for (int i=0;i<n;i++)
        {
            if (map.get(arr[i])==null)
                map.put(arr[i],false);
            else
            {
                if (map.get(arr[i])==true)
                    map.put(arr[i],false);
                else
                    map.put(arr[i],true);
            }
        }
       for (Map.Entry<Integer,Boolean> res:map.entrySet())
       {
           if (res.getValue()==true)
               return res.getKey();
       }
       return -1;
    }

}
