public class main{
    public static void main(String[] args){
        int[] nums={1,2,3,4,5};
        
    }
}
class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    
    class Linkedlist{
        Node head;
        Linkedlist(){this.head=null;}
       int deletebeg(){
           if(head==null){
               System.out.println("there are no elements to delete");
               return-1;
           }
           int removedele=head.data;
           head=head.next;
           return removedele;
           
       }
    
    }
    }
