package mastery;

import java.util.*;

// find the longest word from a given string
public class LongestWord {

    public static void main(String[] args) {
        /*
            first separate the given strings into array of strings
            take first string and check if it is larger than index string
         */

        String s = "fun&!! time special!";
        String[] n = s.split(" ");

        String longestWord = "";

        for (int j=0;j<n.length;j++) {
            String comp = n[j].replaceAll("[&!]", ""); ;
            if (comp.length()>longestWord.length()) {
                longestWord = comp;
            }
        }
        System.out.println(longestWord);
    }
}
