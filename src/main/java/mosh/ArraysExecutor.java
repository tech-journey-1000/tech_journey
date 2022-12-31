package mosh;

public class ArraysExecutor {
    public static void main(String[] args) {
        Arrays arr = new Arrays(5);
        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        arr.insert(4);
        arr.insert(5);
        arr.reverseArray(arr.array);
        arr.print(arr.array);
    }
}
