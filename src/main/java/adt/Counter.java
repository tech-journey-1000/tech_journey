package adt;

public class Counter {

    int val = 0;
    String name = null;

    public Counter(String str) {
        this.name = str;
    }

    public void increment(){
    val++;
    }

    public int getCurrentValue(){
        return val;
    }

    public String toString(){
        return name;
    }

}
