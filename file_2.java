// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Node{
    int data;
    Node next;
    
    Node(int val){
        this.data = val;
        this.next = null;
    }
}

class Main {
    public static void main(String[] args) {
      Node first = new Node(10);
      Node second  = new Node(20);
      Node third = new Node(30);
      Node four = new Node(40);
      
      first.next = second;
      second.next = third;
      third.next = four;
      
      Node head , temp;
      head = first ;
      temp = head;
      
      // delete node at any given position
      System.out.println("Enter the position that you want to delete");
      Scanner sc = new Scanner(System.in);
      int position = sc.nextInt();
      position--;
      
      for(int i = 1 ; i<= (position - 1);i++){
          temp = temp.next;
      }
      
      Node a = temp.next;
      temp.next = temp.next.next;
      a.next = null;
      
      
      
      //print the linked list
      temp = head;
      
      for(;temp!=null;){
          System.out.print(" " + temp.data);
          temp = temp.next;
      }
      
      


    }
}