package academy.learnprogramming;

import java.util.Arrays;

public class MyStack {

    private final static int INITIAL_SIZE = 0;

    Object[] myStackStorage = new Object[INITIAL_SIZE];

    public Object push(Object value){
        Object[] tempMyStackStorage = new Object[myStackStorage.length + 1];
        tempMyStackStorage = Arrays.copyOf(myStackStorage, tempMyStackStorage.length);
        myStackStorage = tempMyStackStorage;
        myStackStorage[myStackStorage.length-1] = value;
        return value;
    }

    public Object remove(int index) {
        Object returnObject = null;
        Object[] tempStackStorage = Arrays.copyOf(myStackStorage, myStackStorage.length-1);
        for (int i = 0; i < myStackStorage.length; i++) {
            if (i < index) {
                tempStackStorage[i] = myStackStorage[i];
            } else if (i > index) {
                tempStackStorage[i - 1] = myStackStorage[i];
            } else {
                returnObject = myStackStorage[i];
            }
        }
        myStackStorage = Arrays.copyOf(tempStackStorage, tempStackStorage.length);
        return returnObject;
    }

    public void clear() {
        myStackStorage = Arrays.copyOf(myStackStorage, 0);;
    }

    public int size(){
        return myStackStorage.length;
    }

    public Object peek(){
        return myStackStorage[myStackStorage.length-1];
    }
    public Object pop(){
        Object removedObject = myStackStorage[myStackStorage.length-1];
        myStackStorage = Arrays.copyOf(myStackStorage, myStackStorage.length-1);
        return removedObject;
    }
    public void print() {
        for (Object object : myStackStorage) {
            if (object != null) {
                System.out.println(object);
            }
        }
    }
}
