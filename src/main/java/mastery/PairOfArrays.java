package mastery;

public class PairOfArrays {

    public static void main(String arg[]) {
        pairOfArray();
        allPairsOfArray();
    }

    private static void allPairsOfArray() {
        String[] arr = {"a","b","c","d","e"};
        for (String s : arr) {
            for (String value : arr) {
                System.out.println(s + "," + value);
            }
            System.out.println("");
        }
    }

    private static void pairOfArray() {
        int[] arr = {1,2,3,4,5,6,7,8,9,0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (i%2 == 0) {
                System.out.print(arr[i]);
                int j = 0;
                j += i + 1;
                if (j< arr.length) {
                    System.out.print("," + arr[j]);
                } else {
                    System.out.print("," + "no pair found");
                }
            }
            System.out.println(" ");
        }
    }
}
