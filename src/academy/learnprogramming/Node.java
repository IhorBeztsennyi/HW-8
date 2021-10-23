package academy.learnprogramming;

public class Node {
    private Object object;
    private Node nextNode;
    private Node previousNode;

    public Node(Object object, Node nextNode, Node previousNode) {
        this.object = object;
        this.nextNode = nextNode;
        this.previousNode = previousNode;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }

    @Override
    public String toString() {
        return ("Previous: " + this.getPreviousNode() + " object " + "Next: " + this.getNextNode());
    }
}
