package main;

public class SinglyLinkedList {
    private class Node{
        private int data;
        private Node next;

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node() {
            this.data = 0;
            this.next=null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    private Node head = null;
    private int size = 0;

    public static void main(String[] args) {
        SinglyLinkedList linkedlist = new SinglyLinkedList();
        System.out.println(linkedlist);
        for(int i = 0;i<5;i++)
        {
            linkedlist.insertHead(i+1);
        }
         linkedlist.insertHead(42);
        System.out.println(linkedlist);
    }

    @Override
    public String toString() {
        StringBuilder response = new StringBuilder();
        response.append("[");
        Node temp = this.head;
        while(temp!=null) {
            response.append(temp.getData());
            temp = temp.next;
        }
        response.append("]");
        return super.toString();
    }

    private void insertHead(int data){
        Node newNode = new Node(data,this.head);
        this.head = newNode;
        size++;
}



}
