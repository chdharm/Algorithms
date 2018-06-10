package ArraysString;

import java.util.*;

/**
 *Remove minimum number of characters so that two strings become anagram
 *Input : str1 = "bcadeh" str2 = "hea"
 Output: 3
 We need to remove b, c and d from str1.

 Input : str1 = "cddgk" str2 = "gcd"
 Output: 2

 Input : str1 = "bca" str2 = "acb"
 Output: 0
 *
* */
public class RemoveToMakeAnagram {
    public static void main(String[] args) {
        String str1 = "bcadeh";
        String str2="hea";
        str1=toLower(str1);
        str2=toLower(str2);
        str1=sort(str1);
        str2=sort(str2);
        if (getCountInMap(str1,str2))
            System.out.println("ANAGRAM");
        else
            System.out.println("NOT ANA");


    }

    public static boolean getCountInMap(String str1, String str2)
    {
        List<Map<String,Integer>> resultList=new ArrayList<>();
        Map<String,Integer> Mapstr1=new HashMap<>();
        Map<String,Integer> Mapstr2=new HashMap<>();

        for (int i=0;i<str1.length();i++)
        {
            Integer temp=Mapstr1.get(str1.charAt(i));
            Mapstr1.put(String.valueOf(str1.charAt(i)),(temp==null)?1:Mapstr1.get(str1.charAt(i))+1);
        }
        for (int i=0;i<str2.length();i++)
        {
            Integer temp=Mapstr2.get(str2.charAt(i));
            Mapstr2.put(String.valueOf(str2.charAt(i)),(temp==null)?1:Mapstr2.get(str2.charAt(i))+1);
        }
        return checkMapForAnagrams(Mapstr1,Mapstr2);
    }

    public static boolean checkMapForAnagrams(Map<String,Integer> map1,Map<String,Integer> map2)
    {
        for (Map.Entry<String,Integer> entry:map1.entrySet())
        {
            if (map2.containsKey(entry.getKey()))
            {
                //check if contains also check count
            }
            //if not contains check count


        }
       return true;
    }


    public static String toLower(String str)
    {
        return str.toLowerCase();
    }
    public static String sort(String str){
        char []a=str.toCharArray();
        Arrays.sort(a);
        return String.valueOf(a);
    }
}
