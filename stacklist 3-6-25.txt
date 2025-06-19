public class main{
    public static void main(String[] args){
        stack n=new stack();
        n.push(10);
         n.push(20);
         n.pop();
        n.print();
    }
    
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class stack{
    Node head;
    stack(){
        this.head=null;
    }
    boolean isempty(){
        if(head==null){
            return true;
        }else{
            return false;
        }
    }
    void push(int data){
        Node newNode=new Node(data);
        if(isempty()){
            this.head=newNode;
            return;
        }newNode.next=head;
        head=newNode;
    }
    int pop(){
        if(isempty()){
             System.out.println("stack is empty");
            return-1;
        }
        else{
            int val=head.data;
            head=head.next;
            return val;
        }
        }
        void print(){
            var temp=head;
              System.out.println("______________");
             while(temp!=null){
                  System.out.println(temp.data+" ");
                  temp=temp.next;
            
             }
              System.out.println("______________");
        }
        
    }
