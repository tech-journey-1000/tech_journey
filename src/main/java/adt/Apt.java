package adt;

public class Apt {

    public static void main (String args[]) {
        Counter myCo = new Counter("Name");
        myCo.increment();
        myCo.increment();
        myCo.increment();

        System.out.println(myCo.getCurrentValue());

        System.out.println(myCo.toString());
    }
}
