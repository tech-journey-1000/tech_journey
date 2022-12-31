package mastery;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) { //"abcabcbb" "pwwkew" "wke"

        char[] string = s.toCharArray();
        Set<String> store = new HashSet<>();
        String lastSaved = "";

        for(int i=0;i<string.length;i++) {
            if (!store.contains(String.valueOf(string[i]))) {
                store.add(String.valueOf(string[i]));
            } else if(i<string.length-1 && lastSaved.equalsIgnoreCase(String.valueOf(string[i]))) {
                store.removeAll(store);
            }
            lastSaved = String.valueOf(string[i]);
        }

        return store.size();
    }
}
