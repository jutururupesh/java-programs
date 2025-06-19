public class Main{
    public static void main(String[] args){
        Queue q=new Queue();
        q.enqueue(10);
         q.enqueue(20);
        q.print();
    }
    }
class Queue {
   int[] queue;
   int size;
   int front;
   int rear;
  Queue(int size){
       this.size=size;
       this.queue= new int[size];
       this.front=0;
       this.rear=-1;
   }
   boolean isfull(){
       if(front==size-1){
       System.err.println("queue is full");
           return true;
       }else{
           return false;
       }
   }
   boolean isempty(){
       if(rear==-1){
            System.err.println("queue is empty");
           return true;
       }
       else{
           return false;
       }
   }
   void enqueue(int val){
       if(isfull()){
           return;
       } rear=rear+1;
   queue[rear]=val;
   }
   int dequeue(){
       if(isempty()){
            System.err.println("queue is empty");
            return-1;
       }
       int val=queue[rear];
      
       return val;
   }
   void print(){
       for(int i=0;i<=rear;i++){
            System.err.println(queue[i]);
       }
   }
      
   
}