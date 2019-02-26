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

        public Node(Node next) {
            this.next = next;
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
}
