package academy.learnprogramming;

import java.util.Arrays;

public class MyArrayList {
    private final static int INITIAL_SIZE = 16;
    private final static double INCREASE_FACTOR = 2.5;
    private int count = 0;

    Object[] myArrayStorage = new Object[INITIAL_SIZE];

    public boolean add(Object value) {
        if (myArrayStorage.length <= count) {
            myArrayStorage = Arrays.copyOf(myArrayStorage, (int) (myArrayStorage.length * INCREASE_FACTOR));
        }
        myArrayStorage[count] = value;
        count++;
        return true;
    }

    public boolean remove(int index) {
        Object[] tempMyArrayStorage = Arrays.copyOf(myArrayStorage, myArrayStorage.length);
        for (int i = 1; i < myArrayStorage.length; i++) {
            if (i < index) {
                tempMyArrayStorage[i] = myArrayStorage[i];
            } else if (i > 1) {
                tempMyArrayStorage[i - 1] = myArrayStorage[i];
            }
            myArrayStorage = Arrays.copyOf(tempMyArrayStorage, tempMyArrayStorage.length);
        }
        return true;
    }

    public void clear() {
        Arrays.fill(myArrayStorage, null);
    }

    public int size() {
        int counter = 0;
        for (Object tempObject : myArrayStorage) {
            if (tempObject != null) {
                counter++;
            }
        }
        return counter;
    }

    public Object get(int index) {
        Object tempObject = null;
        for (int i = 0; i < myArrayStorage.length; i++) {
            if (i == index) {
                tempObject = myArrayStorage[i];
            }

        }
        return tempObject;
    }


    public void print() {
        for (Object object : myArrayStorage) {
            if (object != null) {
                System.out.println(object);
            }
        }
    }
}
