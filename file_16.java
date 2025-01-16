// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Node{
    
    int data;
    Node next;
    
    // Node(int data){
    //     this.data = data;
    //     this.next = null;
    // }
    
}

class Main {
    public static void main(String[] args) {
        
        Node head , temp;
        
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();
        Node four = new Node();

        first.data = 10;
        second.data = 20;
        third.data = 30;
        four.data = 40;
        
        first.next = second;
        second.next = third;
        third.next = four;
        
        
        head = first;
        temp = first;
        
        
        //adding a node at the begining
        
        Node new_node = new Node();
        new_node.data = 0;
        new_node.next = head;
        head = new_node;
        temp = head;
        
        
        
        
        
        
        for(;temp!=null;){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        
        System.out.println(" ");
        System.out.println(temp);
        
        //so in this task , i came to know why we really have to initialise the temp = head; but not to directly the first node , because if we add a node at begining , then head will be changed but still the temp points to the previous first node which now became the second node. 
        
        
        
        

        
        
        
        
    }
}