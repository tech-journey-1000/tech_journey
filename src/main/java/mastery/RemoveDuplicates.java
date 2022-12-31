package mastery;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {1,1,2};

        List<Integer> l = Arrays.asList(1,2,3);
        System.out.println(l.size());
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) { // nums = [1,1,2] // Output: 2, nums = [1,2,_]
//
//        int[] store = new int[nums.length];
//        int j = 0;
//        for(int i=0;i<nums.length-1;i++) {
//            if (nums[i] != nums[i+1]){
//                store[j] = nums[i]; //[1,0,0]
//                j++;
//            }
//        }
//
//        store[j] = nums[nums.length-1]; // [1,2,0]
//        System.out.println(Arrays.toString(store));
//        for (int i=1; i<j+1;i++){
//            nums[i] = store[i];
//        }
//
//        System.out.println(Arrays.toString(nums));
//        return j+1;

        int[] store = new int[nums.length];
        int j=0;

        System.out.println(nums.length);
        for(int i=0;i<=nums.length-1;i++) {//2
            if (nums.length-1 == i) {
                store[j] = nums[nums.length-1];
                j++;
            } else if(nums[i] != nums[i+1]) {
                store[j] = nums[i];
                j++;
            }
        }
        for (int i=1; i<j;i++){
            nums[i] = store[i];
        }
        return j;
    }
}
