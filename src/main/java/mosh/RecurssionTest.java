package mosh;

public class RecurssionTest {

    public static void main(String[] args) {
        recurssion(4);
//        System.out.println(factorial(4));
    }

    public static void recurssion(int n) {
        if (n<1) {
            System.out.println("n is less than 1");
        } else {
            recurssion(n-1);
            System.out.println("n : " + n);
        }
    }

    public static int factorial(int n) {
        if (n<1) {
            return -1;
        }
        if (n==0 || n ==1 ){
            return 1;
        }
        int factorial = n * factorial(n-1); // 4*fac(3)*fac(2)*1
        System.out.println("factorial : " + factorial); //1,2,3,4
        return factorial;
    }
}
