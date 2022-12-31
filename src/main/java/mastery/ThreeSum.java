package mastery;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        threeSum();
    }

    private static List<List> threeSum() {

        List<List> resul = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        resul.add(l1);
        resul.add(l2);

        List<Integer> input = Arrays.asList(-1,0,2,1,-1,-4); // [[-1,-1,2],[-1,0,1]]

//        Set<Integer> store  = new HashSet<>();
        int counter = 0;
        for(int i = 0; i<input.size();i++) {
            int adder = counter-input.get(i);
            if (resul.get(1).size() < 2 && !l1.contains(input.get(i))) {
                l1.add(input.get(i));
                if (resul.get(1).size() == 1 && counter==0) {
                    l1.add(input.get(i));
                }
                counter += input.get(i);
            } else if(resul.get(2).size() < 2 && l2.contains(input.get(i))) {

            }
        }
        /*
        take first index, -1,0 and check -1,0 = -1 find -1?
         */

        LinkedList<String> ll = new LinkedList<>();

        return resul;
    }
}
