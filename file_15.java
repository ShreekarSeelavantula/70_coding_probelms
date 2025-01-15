// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

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

System.out.println("Enter the position that you want to insert");
Scanner sc = new Scanner(System.in);
int pos = sc.nextInt();//2
pos--;//making it in index;


System.out.println("Enter the data that you want to insert");
Node new_node = new Node(sc.nextInt()); 

for(int i = 0+1 ; i<=(pos-1) ; i++){// 0 1
    temp = temp.next;
}

new_node.next = temp.next;
temp.next = new_node;

temp = head;
for(;temp.next!=null;){
    System.out.print(temp.data + " ");
    temp = temp.next;
}
System.out.print(temp.data);
    }
}