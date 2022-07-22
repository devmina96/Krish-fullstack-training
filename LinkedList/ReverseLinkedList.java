public class LinkedList {       
    class Node{    
        int data;    
        Node next;    
            
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }    
    }    
        
    public Node head = null;    
    public Node tail = null;    
          
    public void addNode(int data) {      
        Node newNode = new Node(data);    
               
        if(head == null) {       
            head = newNode;    
            tail = newNode;    
        }    
        else {       
            tail.next = newNode;       
            tail = newNode;    
        }    
    }   
	
	



	void reverse(LinkedList list)
    {
        Node prev = null;
        Node current = list.head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        Node node = prev;

		list.print(node);



    }



           
    public void print(Node node) {       
        Node current = node;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Original linked list: ");    
        while(current != null) {       
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }    
        
    public static void main(String[] args) {    
            
        LinkedList LL = new LinkedList();    
                
        LL.addNode(1);    
        LL.addNode(2);    
        LL.addNode(3);    
        LL.addNode(4);    
               
        LL.print(LL.head);  
		LL.reverse(LL); 
	
    }    
}  