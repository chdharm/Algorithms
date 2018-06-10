package Maps;

import java.util.HashMap;

public class Votes {
    public static void main(String[] args) {
        String[] votes = { "john", "johnny", "jackie",
                "johnny", "john", "jackie",
                "jamie", "jamie", "john",
                "johnny", "jamie", "johnny",
                "john" };

        findWinner(votes);
    }
    public static void findWinner(String [] votes)
    {
        HashMap<String,Integer> resMap=new HashMap<>();
        for (int i=0;i<votes.length;i++)
        {
            Integer temp=resMap.get(votes[i]);
            resMap.put(votes[i],(temp==null)?1:resMap.get(votes[i])+1);
        }
    }
}
