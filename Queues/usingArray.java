public class usingArray {
    static class Queue{
        static int arr[];
        static int rear;
        static int size;
        static int Front;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            Front = -1;
        }
        public static boolean isEmpty(){
            return rear==-1 && Front==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size == Front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return ;
            }
            //add firt element
            if (Front==-1) {
                Front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result= arr[Front];
          
            //last element remove
            if (rear==Front){
                rear=Front=1;
            }else{
                Front = (Front+1)%size;
            }
            return result;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[Front];
        }
    }
    public static void main(String[] args) {
        Queue Q = new Queue(5);
        Queue.add(100);
        Queue.add(20);
        Queue.add(30);
        Queue.add(40);
        Queue.add(50);
        System.out.println();
        while (!Q.isEmpty()) {
            System.out.println(Q.peek());
            Q.remove();
        }
    }
}
