package main;



public class Node {
    // commit Ctrl+k
    // push Ctrl+shift+k
     private int data;
     private Node next;

    public Node getNext() {
        return next;
    }

    public Node(int data) {
        this.data = data;
    }

    public Node (Node next) {
        this.next = next;
    }

    public Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }

    public Node()
    {this.data=0;
    this.next=null;

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
