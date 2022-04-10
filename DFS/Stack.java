class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;

    }
}
class Stack {
    Node head;
    int count=0;

    public Stack(){

        this.head = null;
    }

    void add(int key){
        Node oldhead = head;
        Node node = new Node(key);

        head = node;
        head.next=oldhead;

        count++;

    }

    int remove(){
        if(head==null){
            System.out.println("Stack is empty");
        }
        Node temp = head;
        head=head.next;

        count--;
        return temp.data;
    }

    int size(){
        return count;
    }
}

