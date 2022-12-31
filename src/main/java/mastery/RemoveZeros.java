package mastery;

import java.util.*;

public class RemoveZeros {

    /*
       {0,1,0,3,12}

       loop -> if i==0 , move i to last index. else ignore.
       step 1: {1,0,3,12,0}
       step 2: i = 0 , move i to last index.
       step 3: {1,3,12,0,0}
       step 4 : ignore.
       step 5: i = 0 , move i to last index. {1,3,12,0,0}
       step 6: Done.

        */
    public static void main(String[] args) {
        extracted();

//        leetCode();
    }

    private static void leetCode() {
        int[] nums = {0,1,0,3,12};
        int j = 0;

        for (int i=0;i<nums.length;i++) {
            if (nums[i]!=0) {
                nums[j++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums) + " " + j);

        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }

    private static void extracted() {
        int[] nums = {0,1,0,3,12,0,3,56,6,0,-1};
        int[] result = new int[nums.length];
        int j = 0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i]!=0) {
                result[j++] = nums[i];
            }
        }
        nums=result;
        System.out.println(Arrays.toString(nums));
    }
}
