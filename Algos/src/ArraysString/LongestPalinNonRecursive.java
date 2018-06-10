package ArraysString;

/***
 * Given a string, find the longest substring which is palindrome.
 * For example, if the given string is “forgeeksskeegfor”, the output should be “geeksskeeg”.
 */
public class LongestPalinNonRecursive {
    public static void main(String[] args) {

        String str = "forgeeksskeegfor";
        System.out.println(checkLongest(str));
    }

    private static String checkLongest(String str) {
        int flag=0;
        int tempI=0,tempJ=0;
        for (int i=0,j=str.length()-1;i<=j;i++,j--)
        {
            if (str.charAt(i)==str.charAt(j))
            {
                if (flag==0)
                {
                    tempI=i;
                    tempJ=j;
                    flag=1;
                }
            }
            else
                flag=0;

        }
        return str.substring(tempI,tempJ+1);
    }
}

