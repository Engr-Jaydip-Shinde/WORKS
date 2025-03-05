public class UsingLikedList{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }   
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;
        public static boolean isEmpty(){
            return head==null && tail==null ;
        }
        public static void add(int data){
            Node newNode = new Node(data);
            if (head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public static int remove(){
            if (isEmpty()) {
                System.out.println("Empty Queuer");
                return -1;
            }
            int front = head.data;
            //single element
            if(tail==head){
                tail=head=null;
            }else{
                head=head.next;
            }
            return front;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue Q = new Queue();
        Q.add(1);
        Q.add(2);
        Q.add(3);
        while(!Q.isEmpty()){
            System.out.println(Q.peek());
            Q.remove();
        }
    }
}