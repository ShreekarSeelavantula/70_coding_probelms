// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}


class Main {
    public static void main(String[] args) {
        
        Node head , temp;

Node first = new Node(10);
Node second = new Node(20);
Node third = new Node(30);


first.next = second;
second.next = third;

head = first;
temp = head;


//Insert a Node at the end

Node four = new Node(40);



for(;temp.next!=null;){
    System.out.print(temp.data + " ");
    temp = temp.next;
}
    System.out.print(temp.data + " ");


temp.next = four;
temp = temp.next;
    System.out.print(temp.data + " ");


    }
}