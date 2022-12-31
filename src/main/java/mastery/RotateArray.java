package mastery;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

//        extracted();

        leetCode();
    }

    private static void leetCode() {
        // [1,2,3,4,5,6,7], k = 3
        // [5,6,7,1,2,3,4]
        // Create an empty array, with the size of nums. and start adding nums from given index first.
        // step 1: [5,6,7,0,0,0,0]
        // step 2: start from k and k=3

        int k =1;
        int[] nums = {1,2,3,4,5,6,7,5};
        while (k > nums.length) {
            k = k - nums.length;
        }

        int[] store = new int[nums.length];
        System.out.println("Store : " + Arrays.toString(store));
        int index = 0;
        int Storeindex = 0;

        for (int i=0;i<store.length;i++) {
            store[i] = nums[i]; // how to get index value
        }
        System.out.println("Store After saving required elements : " + Arrays.toString(store));

        for (int i=nums.length-k;i<nums.length;i++) { //[5,6,7,4,5,6,7]
            nums[index++] = nums[i];
        }
        System.out.println("Nums after copying rem ele : " + Arrays.toString(nums));

        for(int i=k;i<nums.length;i++) {
            nums[i] = store[Storeindex++];
        }

        System.out.println(Arrays.toString(nums));
    }

    private static void extracted() {
//        int[] nums = {-1,-100,3,99};
        int[] nums= {1,2,3,4,5,6,7};
        int[] result = new int[nums.length];
        int k = 3 ;
        int y = k;
        int index = 0;
        for (int i=1;i<=k;i++) {
            result[index++] = nums[y++];
        }

        System.out.print(Arrays.toString(result));

        for(int i=0;i<k;i++) {
            result[index++] = nums[i];
        }

        System.out.print(Arrays.toString(result));
    }

    /*
     // [1,2,3,4,5,6,7], k = 3
        // [5,6,7,1,2,3,4]
        // Create an empty array, with the size of nums. and start adding nums from given index first.
        // step 1: [5,6,7,0,0,0,0]
        // step 2: start from k and k=3
        while (k > nums.length) {
            k = k - nums.length;
        }

        int[] store = new int[nums.length-k];  //[5,6,7,1,3,4,7] , k=4
        int index = 0;
        int Storeindex = 0;

        for (int i=0;i<store.length;i++) {
            store[i] = nums[i]; // how to get index value
        }

        for (int i=nums.length-k;i<nums.length;i++) { //[5,6,7,4,5,6,7]
            nums[index++] = nums[i];
        }

        for(int i=k;i<nums.length;i++) {
            nums[i] = store[Storeindex++];
        }
     */
}
