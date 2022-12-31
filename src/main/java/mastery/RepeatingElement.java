package mastery;

import java.util.*;

/*
Find the FIRST repeating element in a given array
Example - [2,1,4,5,6,2,3,5] --- Return 2
````````` [2,1,1,2,1,2,3,4,5] --- Return 1

First i will take first value from the given array and to store it in a place.
I will iterate through the given array while checking for each index
if the stored value is present in a given index of input array or not.
 */
public class RepeatingElement {
    static List<Integer> input = Arrays.asList(2,1,1,2,4,4,5,5); // 3 //
    public static void main (String[] args) {
//        oofn();
        System.out.println(nsquare());
    }

    private static boolean nsquare() {
        int second = 0;
        for (int i=0;i<input.size();i++) {
            int comp = input.get(i); //1
            for (int j=i+1;j<input.size();j++) { // 3 // 1,2,3
                second = input.get(j); // 2
                if (input.size()>j+1 && second == input.get(j+1)) { //2
                    System.out.println(second);
                    return true;
                }
                if (comp == input.get(j)) { //1
                    System.out.println(input.get(i));
                    return true;
                }
                String s = "sds";
                char[] sa = s.toCharArray();
                Set saa = new HashSet<>();

            }
        }
        return false;
    }

    private static void oofn() {
        Set<Integer> st = new HashSet<>(); // 2,1,2
        for (int i=0;i<input.size();i++) {
            if (st.contains(input.get(i))){
                System.out.println(input.get(i));
                break;
            }
            st.add(input.get(i));
        }
    }
}
