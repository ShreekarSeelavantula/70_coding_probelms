// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Node{
    
    int data;
    Node next;
    


    // see here i am not writing the constructors
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
        
        for(;temp.next!=null;){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        
        
        
        
        
        

        
        
        
        
    }
}