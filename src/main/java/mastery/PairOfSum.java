package mastery;
/*
Goal is to find the given sum from an array. If you find a pair print pair found. Else return pair not found.
Example - input = {1,3,4,5,6,7,8} sum = 9

This will test:
1. If candidate is asking the right questions like...,What is the most important value of the problem?
Do you have to consider time, and space and memory, etc?
2. Checks if candidate is thinking about brute force approach first and should start asking right questions.
3. If candidate is thinking about the error scenarios or not.
4. We can combine this question with java 8 streams as well to see if candidate is able to approach the problem using Java8.
4. End goal is not to see the perfect output but to see how candidate is approaching the problem and asking the right questions.
5. If we have time at the end, as a follow-up question we can discuss time and space complexity.
*/

import java.util.*;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;

public class PairOfSum {

    static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
    static int target = 7;
    static int sum = 0;
    static int result = 0;

    public static void main(String[] args) {
//        bruteForceApp(arr); // O(n^2) approach. This is not a good approach but solves the problem.
//        refinedMethod(arr); // O(n) approach
//        streams();
//        usingSet(arr); // i think this the best approach
//        extracted();
//        twoSum(arr, 7);

        int[] res = map();
        System.out.println(res);
    }

    private static int[] map() {
        Map<Integer, Integer> store = new HashMap<>();
        for (int i=0; i<arr.length;i++) {
            if (store.containsKey(target - arr[i])) {
                return new int[]{i, store.get(target - arr[i])};
            }
            store.put(arr[i],i);
        }
        throw new IllegalArgumentException("No solution");
    }

    public static int[] twoSum(int[] nums, int target) {
        Set<Object> store = new HashSet<>();
        int[] resul = new int[0];
        for (int i=0; i<nums.length;i++) {
            int index = nums[i];
            int result = target - index;
            if (store.contains(result)) {
                System.out.println(index + result);
                resul = new int[]{index, result};
                return resul;
            }
            store.add(nums[i]);
        }
        return resul;
    }


    private static void extracted() {
        List list = Collections.singletonList(Arrays.asList(arr).get(0));

        for(int i=0;i<list.size();i++) {
            int element = arr[i];
            int result = sum-element;
            if (list.contains(result)) {
                System.out.println("Pair found!" + element);
                break;
            }
        }
    }

    private static void usingSet(int[] arr) {
        Set<Object> setObj = new LinkedHashSet<>();
        for (int i=0;i<arr.length;i++) {
            int resul = sum-arr[i];
            if (setObj.contains(resul)) {
                System.out.println("Pair Found!!! " + " val 1 = " + arr[i] + ", val 2 = " + resul);
                break;
            } else if(arr.length == i+1) {
                System.out.println("Pair Not Found");
            }
            setObj.add(arr[i]);
        }
    }

    private static void streams() {
        List<Object> objectList = Arrays.asList(arr);

        Arrays.stream(arr).anyMatch(val -> {
            int sumVal = sum - val;
            if (objectList.contains(sumVal)) {
                System.out.println("Pair Found!!! Value 1 = " + val + " , Value 2 = " + sumVal);
                return true;
            }
            return false;
        });
//        Arrays.stream(arr).iterator().forEachRemaining((IntConsumer) value -> {
//            int sumVal = sum - value;
//            if (objectList.contains(sumVal)) {
//                System.out.println("Pair Found!!! Value 1 = " + value + " , Value 2 = " + sumVal);
//            } else {
//                System.out.println("Pair Not Found");
//            }
//        });
    }

    private static void refinedMethod(int[] array) { // Time = O(n) approach
        Set<Integer> objectList = Arrays.stream(array).boxed().collect(Collectors.toSet());
//        Integer[] integerArray = ArrayUtils.toObject(intArray); using ArrayUtil Apache commons lib.
        System.out.println(objectList);
        for (int j : arr) {
            int sumVal = sum - j;
            if (objectList.contains(sumVal)) {
                System.out.println("Pair Found!!! Value 1 = " + j + " , Value 2 = " + sumVal);
                break;
            } else {
                System.out.println("Pair Not Found");
            }
        }
    }

    private static void bruteForceApp(int[] arr) { // Time = O(n^2) approach
        for(int i=0;i<arr.length;i++) {
            for (int j=0; j<arr.length; j++) {
                result = i+j;
            }
            if (result == sum) {
                System.out.println("Pair Found!!!" + result);
                break;
            } else {
                System.out.println("Pair Not Found!!!");
            }
        }
    }
}
