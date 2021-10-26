package academy.learnprogramming;

import java.util.Arrays;

public class MyQueue {
    private final static int INITIAL_SIZE = 0;
    private int count = 0;

    Object[] myQueueStorage = new Object[INITIAL_SIZE];

    public boolean add(Object value) {
        if (myQueueStorage.length <= count) {
            myQueueStorage = Arrays.copyOf(myQueueStorage, (myQueueStorage.length + 1));
        }
        myQueueStorage[count] = value;
        count++;
        return true;
    }

    public Object remove(int index) {
        Object returnObject = null;
        Object[] tempQueueStorage = Arrays.copyOf(myQueueStorage, myQueueStorage.length-1);
        for (int i = 0; i < myQueueStorage.length; i++) {
            if (i < index) {
                tempQueueStorage[i] = myQueueStorage[i];
            } else if (i > index) {
                tempQueueStorage[i - 1] = myQueueStorage[i];
            } else {
                returnObject = myQueueStorage[i];
            }
        }
        myQueueStorage = Arrays.copyOf(tempQueueStorage, tempQueueStorage.length);
        return returnObject;
    }



    public void clear() {
        myQueueStorage = Arrays.copyOf(myQueueStorage, 0);
    }

    public int size() {
        return myQueueStorage.length;
    }

    public Object peek() {
        Object resultObject = null;
        if (myQueueStorage.length == 0) {
            return resultObject;
        } else {
            resultObject = myQueueStorage[0];
        }
        return resultObject;
    }

    public Object poll() {
        Object resultObject = null;
        if (myQueueStorage.length == 0) {
            return resultObject;
        } else {
            resultObject = myQueueStorage[0];
            Object[] tempMyQueueStorage = new Object[myQueueStorage.length - 1];
            for (int i = 1; i < myQueueStorage.length; i++) {
                tempMyQueueStorage[i - 1] = myQueueStorage[i];
                myQueueStorage = Arrays.copyOf(tempMyQueueStorage, tempMyQueueStorage.length);
            }
        }
        return resultObject;
    }

    public void print() {
        for (Object object : myQueueStorage) {
            if (object != null) {
                System.out.println(object);
            }
        }
    }
}
