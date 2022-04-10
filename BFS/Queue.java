import javax.swing.plaf.IconUIResource;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;

    }
}

class Queue {
    Node head, tail;
    int count=0;

    public Queue(){
        this.head = this.tail = null;
    }

    void enqueue(int key){
        Node node = new Node(key);

        if(head==null){
            head = node;
            tail = node;
        }
        else {
            tail.next = node;
            tail = node;
        }
        count++;

    }

    int dequeue(){
        if(head==null){
            System.out.println("Queue is empty");
        }
        Node temp = head;
        head=head.next;

        if(head==null){
            tail=null;
        }
        count--;
        return temp.data;
    }

    int size(){
        return count;
    }

}
