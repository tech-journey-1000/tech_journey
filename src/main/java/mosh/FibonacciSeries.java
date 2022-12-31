package mosh;

import java.sql.Timestamp;
import java.util.Date;

public class FibonacciSeries {

    public static void main(String[] args) {
        FibonacciSeries newd = new FibonacciSeries();
//        newd.fib(16);
        System.out.println(newd.rec_fib(2));

//        System.out.println(factorial(4));
    }

    private void fib(int n) {
        n= n+1;
        int[] result = new int[n];
        for (int i=0;i<n;i++){
            if(i<=1){
                result[i] = i;
            } else {
                result[i] = result[i-1]+result[i-2]; //
            }
        }
        System.out.println(result[n-1]);
    }

    private int rec_fib(int n) {//0,1,1,2,3,5 ... //3
        int res = 0;
        if (n==0||n==1) {
            return n;//1+0
        }
        if (n<=0) {
            return -1;
        }
        res = rec_fib(n-1) + rec_fib(n-2); //
        return res;
    }
}
