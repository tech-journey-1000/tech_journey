package mosh;

public class Arrays {
    //Lesson learnt -- Int is a primitive variable hence we cannot use for checking nulls.
    //If we want to check for nulls or empty we have to wrapper class like Integer.
    public Integer[] array;

    public Arrays(int length){
        array = new Integer[length];
    }

    public void print(Integer[] array){
        System.out.println(java.util.Arrays.toString(array));
    }

    public void insert(Integer item){
        for(int i=0;i<array.length;i++){
            if(array[i]==null && item!=null){
                array[i] = item;
                item = null;
            }
        }
    }

    public void removeAt(int position){
        for(int i=0;i<array.length;i++){
            if(i==position){
                array[i] = null;
            }
        }
    }

    public void insertAt(int position, int item){
        for(int i=0;i<array.length;i++){
            if(i==position){
                array[i] = item;
            }
        }
    }

    public void reverseArray(Integer[] array){
        Integer[] tempArray = new Integer[array.length];
        int count = array.length-1;
        for(int i=0;i<array.length;i++){
            if(tempArray[i]!=array[i]){
                tempArray[count] = array[i];
                count--;
            }
        }
        System.out.println("Reversed Array: "+java.util.Arrays.toString(tempArray));
    }
}
