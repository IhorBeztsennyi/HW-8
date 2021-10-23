package academy.learnprogramming;
import java.util.Arrays;

public class MyLinkedList {
    private final static int INITIAL_SIZE = 0;

    Node[] nodes;

    public MyLinkedList() {
        this.nodes = new Node[INITIAL_SIZE];
    }

    public void add(Object value) {
        if (nodes.length == 0) {
            nodes = Arrays.copyOf(nodes, nodes.length + 1);
            Node newNode = new Node(value, null, null);
            nodes[0] = newNode;
        } else {
            nodes = Arrays.copyOf(nodes, nodes.length + 1);
            Node newNode = new Node(value, null, nodes[nodes.length - 2]);
            nodes[nodes.length - 1] = newNode;
            nodes[nodes.length - 2].setNextNode(newNode);

        }
    }

    public void remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > nodes.length - 1) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            nodes[1].setPreviousNode(null);
            Node[] tempNodes = new Node[nodes.length - 1];
            for (int j = 1; j < nodes.length; j++) {
                tempNodes[j - 1] = nodes[j];
                nodes = Arrays.copyOf(tempNodes, tempNodes.length);
            }
        } else if (index == nodes.length - 1) {
            nodes[nodes.length - 2].setNextNode(null);
            nodes = Arrays.copyOf(nodes, nodes.length - 1);
        } else {
            nodes[index - 1].setNextNode(nodes[index + 1]);
            nodes[index + 1].setPreviousNode(nodes[index - 1]);
            Node[] tempNodes = new Node[nodes.length - 1];
            for (int i = 0; i < nodes.length; i++) {
                if (i < index) {
                    tempNodes[i] = nodes[i];
                } else if (i > 1) {
                    tempNodes[i - 1] = nodes[i];
                }
                nodes = Arrays.copyOf(tempNodes, tempNodes.length);
            }
        }

    }

    public void clear() {
        nodes = Arrays.copyOf(nodes, 0);
    }

    public int size() {
        return nodes.length;
    }

    public Node get(int index) {
        int count = 0;
        Node returnNode = null;
        for (int i = 0; i < nodes.length; i++) {
            if (i == index) {
                returnNode = nodes[i];
            }
        }
        return returnNode;
    }
}
