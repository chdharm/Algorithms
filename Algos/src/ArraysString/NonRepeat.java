package ArraysString;

import java.util.HashMap;
import java.util.Map;

public class NonRepeat {
    public static void main(String args[]) {
        String word = "ABDEFGABEF";
        int maxLen = 0;
        int result = count(word, maxLen);
        System.out.println(result);

    }

    public static int count(String a, int maxLen) {
        int tempLen = 0;
        Map<Character, Integer> resMap = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            if (!resMap.containsKey(a.charAt(i))) {
                resMap.put(a.charAt(i), 1);
                tempLen++;
            } else {
                if (tempLen > maxLen)
                    maxLen = tempLen;
                count(a.substring(i, a.length()), maxLen);
            }
        }
        return maxLen;
    }
}
