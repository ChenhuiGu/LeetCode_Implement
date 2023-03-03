package src;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 字符串的非重复子串
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> lastIndex = new HashMap<>();
        int max = 0,start = 0;
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if(lastIndex.containsKey(tmp)){
                start = Math.max(start,lastIndex.get(tmp) + 1);
            }
            lastIndex.put(tmp,i);
            max = Math.max(max,i-start+1);
        }
        return max;
    }
}
