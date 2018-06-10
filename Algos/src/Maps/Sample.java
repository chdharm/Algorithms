package Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sample {
    public static void main(String[] args) {
        String a = "set tes put tup"; // est est ptu ptu est
        String[] resp = a.split(" ");
        String[] original = a.split(" ");

        for (int i = 0; i < resp.length;i++)
        {
            resp[i].toLowerCase();
            char [] temp=resp[i].toCharArray();
            Arrays.sort(temp);
            resp[i]=String.valueOf(temp);
        }

        Map<String,String> resMap= check(resp,original);
        for (Map.Entry<String,String> entry:resMap.entrySet())
        {
            System.out.println(entry.getKey()+"------>"+entry.getValue());
        }
    }


    public static Map<String, String> check(String [] resp,String[] original)
    {
        Map<String,String> resMap=new HashMap<>();
        for (int j=0;j<resp.length;j++) {
            for (int k=j+1;k<resp.length;k++) {
                String temp1 = resp[j];
                String temp2 = resp[k];
                int res = checkPair(temp1, temp2);
                if (res == 1) {
                    resMap.put(original[j], original[k]);
                }
            }
        }
        return resMap;

    }

    public static int checkPair(String temp1, String temp2)
    {
        if (temp1.length()!=temp2.length())
            return -1;

        for (int c=0;c<temp1.length();c++)
        {
            if (temp1.charAt(c)!=temp2.charAt(c))
             return -1;
        }
        return 1;
    }
}
