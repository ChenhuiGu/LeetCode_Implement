package src;

import java.util.*;

public class FirstUniqChar {
    public char firstUniqChar(String s) {
        HashMap<Character, Boolean> map = new LinkedHashMap<>();
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            map.put(ch,!map.containsKey(ch));
        }
        for (Map.Entry<Character, Boolean> entry : map.entrySet()) {
            if(entry.getValue()) return entry.getKey();
        }
        return ' ';
    }
}
