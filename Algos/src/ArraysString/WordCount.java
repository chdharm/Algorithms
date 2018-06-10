package ArraysString;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
        public static void main(String args[])
        {
            String str1="Akshay is is Akshay";
            String [] arr=new String [128];
            arr=str1.split(" ");
            Map<String,Integer> resultMap=new HashMap<>();
            for (String word:arr)
            {
                if (resultMap.containsKey(word))
                    resultMap.put(word,resultMap.get(word)+1);
                else
                    resultMap.put(word,1);
            }
        }
    }

