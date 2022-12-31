package mastery;

import java.util.ArrayList;
import java.util.List;

public class MaxSubarray {

    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums)
    {
        int max_sum = 0;
        int current_elements=0;
        for(int x:nums) {
            if(current_elements<0) {
                current_elements=0;
            }
            current_elements += x;
            max_sum =  max(max_sum , current_elements);
        }
        return max_sum;
    }

    private static int max(int max_sum, int cur) {
        if (max_sum>=cur) {
            return max_sum;
        } else {
            return cur;
        }
    }

}
