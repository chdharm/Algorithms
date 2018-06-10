package Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Count {
    public static void main(String[] args) {
        List<String> response=new ArrayList<>();
        response.add("Akshay");
        response.add("Raghav");
        response.add("Akshay");
        getCount(response);
    }

    public static void getCount(List<String> response)
    {
        HashMap<String,Integer> resMap=new HashMap<>();
        for (String word : response)
        {
            Integer temp=resMap.get(word);
            resMap.put(word,((temp!=null)?resMap.get(word)+1:1));
        }

        for (Map.Entry<String,Integer> entry:resMap.entrySet())
        {
            System.out.println(entry.getKey()+"--------->"+entry.getValue());
        }
    }
}
