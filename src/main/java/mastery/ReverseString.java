package mastery;

public class ReverseString {

    public static void main(String[] args) {
        stringReverse();
    }
    private static void stringReverse() {
        String toBeReversed = "sai nadfs";
        String[] ns = toBeReversed.split("");

        char[] a = toBeReversed.toCharArray();
        System.out.println(a);

        for(int i=1;i<=ns.length;i++) {
            String rev = String.valueOf(ns[ns.length-i]);
            System.out.print(rev);
        }
    }
}
