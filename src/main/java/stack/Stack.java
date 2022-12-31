package stack;

public class Stack {

    char[] stackArray ;

    char size;

    int topVal;

    public Stack(char size) {
        this.size = size;
        this.topVal = -1;
        this.stackArray = new char[size];
    }

    public void push(char j) {
        if (!isFull()) {
            topVal++;
            stackArray[topVal] = j;
        }else {
            System.out.println("done bro");
        }
    }

    private boolean isFull() {
        return (size-1 == topVal);
    }

    public String pop() {
        int otopval = topVal;
        topVal--;
        return String.valueOf(stackArray[otopval]);
    }

    public boolean isEmpty() {
        return (topVal == -1);
    }

}
