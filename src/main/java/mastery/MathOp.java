package mastery;

import java.util.*;

public class MathOp {

    public static void main(String[] args) {
        int re = simple(9);
        System.out.println(re);
    }

    private static int simple(int val) {
        int carry = val/10; // 9/10 = 0.9 , re = 0 reminder
//        int carry = val%10; // 9%10 = 9 , re = 9 divisor
        Set<Integer> store = new HashSet<>();

        List<Integer> store2 = new ArrayList<>();
        int[] a = {1,2,3};
        return carry;
    }
}
