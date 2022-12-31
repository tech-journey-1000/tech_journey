package stack;

public class Stacker {

    public static void main(String arg[]) {

        Stack st = new Stack('1');

        char[] stackArray = {'h','e','l','l','o'};

        for ( int i=0; i<=(stackArray.length-1); i++) {
            st.push(stackArray[i]);
        }

        while (!st.isEmpty()) {
            String val = st.pop();
            System.out.println(val);
        }
    }
}
