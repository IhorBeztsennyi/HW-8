package academy.learnprogramming;

public class MyNode {
    Object item;
    String next;
    String prev;

    MyLinkedList myLinkedList = new MyLinkedList();

    public MyNode(Object item, String next, String prev) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrev() {
        return prev;
    }

    public void setPrev(String prev) {
        this.prev = prev;
    }


}
