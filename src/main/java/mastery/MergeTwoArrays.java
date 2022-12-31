package mastery;

import java.util.*;

public class MergeTwoArrays {

    public static void main (String[] args) {
        //merge these two given arrays
        int[] array1 = {1,3,4,5};
        int[] array2 = {6,7,8,9};

        List<Integer> array3 = new ArrayList<>();

        for (int j=0;j<array1.length;j++) {
            array3.add(j,array1[j]);
        }

        for (int j=0;j<array2.length;j++) {
            array3.add(array1.length+j, array2[j]);
        }

        System.out.println(array3);
    }
}
