package ArraysString;
/**
 *
 * Given a string, find the longest substring which is palindrome.
 * For example, if the given string is “forgeeksskeegfor”, the output should be “geeksskeeg”.
 *
 *
 *
 * */
public class LongestPalin {
    public static void main(String[] args) {
        String str="forgeeksskeegfor";
        checkLongest(str);

    }
    public static void checkLongest(String str)
    {
        int i=0;
        int j=str.length()-1;
        for (i=0,j=str.length()-1;i<=j;i++,j--)
        {
            if (str.charAt(i)!=str.charAt(j))
                checkLongest(str.substring(i+1,j));
        }
        System.out.println(str);
    }
}
