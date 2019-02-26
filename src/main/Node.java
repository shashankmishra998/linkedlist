package MAIN;

import javax.xml.soap.Node;

public class node {
    // commit Ctrl+k
    // push Ctrl+shift+k
     private int data;
     private Node next;

    public Node getNext() {
        return next;
    }

    public node(int data) {
        this.data = data;
    }

    public node(Node next) {
        this.next = next;
    }

    public node() {
    }

    public void setNext(Node next) {

    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
