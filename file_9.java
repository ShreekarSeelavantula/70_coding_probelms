[ 10 | m2 ] -> [20 | m3] -> [30 | m4] -> [40 | null]
 head = m1
 temp = m4
 

 


 while(temp.next != null){
    System.out.print(temp.data + " ");
    temp = temp.next;
 }

so if we do this temp = m4 and temp.next = null so the loop breaks . so we cannot print the data.
so we should use the temp not temp.next


for(;temp!=null;){
    System.out.print(temp.data + " ");
    temp = temp.next;
}


so at last temp = null;

because we are assigning temp = temp.next; as temp.next of last node is null .