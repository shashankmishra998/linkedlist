package MAIN;

import javax.xml.soap.Node;

public class mylinkedlist {
    private Node head;
    private Node tail;
    private int currentSize;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public mylinkedlist(int currentSize) {
        this.currentSize = currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }
    public mylinkedlist(){
        this.head = null;
        this.tail = null;
    }
}
