package main;

 class Singlelinkedlist
{
    private class Node
    {
        private int data;
        Node next;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node() {
            this.data = 0;
            this.next = null;
        }

        public Node(int data)
        {
            this.data = data;
            this.next=null;
        }
    }

    private Node head=null;
    private int size=0;

    @Override
    public String toString()
    {
        StringBuilder response= new StringBuilder();
        response.append("[");
        Node temp=this.head;
        while(temp!=null)
        {
            response.append(temp.getData());
            if(temp.getNext()!=null) {
                response.append(" ==> ");
            }
            temp=temp.getNext();
        }
        response.append("]");
        return response.toString();
    }

    private  void insert_Head(int data)
    {
        Node new_Node=new Node(data,this.head);
        this.head=new_Node;
        size++;


    }
    private void insert_After(int data,Node node)
    {
        Node new_node=new Node(data,node.next);
        node.next=new_node;
        size++;
    }

    public void insert(int data)
    {
        if(head==null)
        {
            insert_Head(data);
        }
        else
        {
            Node temp=this.head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            insert_After(data,temp);
        }
    }

    public static void main(String[] args)
    {
        Singlelinkedlist linkedlist=new Singlelinkedlist();
        System.out.println(linkedlist);
        for (int i = 0; i <5 ; i++)
        {
            linkedlist.insert(i+2);
        }
        linkedlist.insert(42);
        linkedlist.insert(40);
        System.out.println(linkedlist);


    }
}
















