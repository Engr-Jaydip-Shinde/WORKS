import java.util.*;
public class Using2Stack {
    static class Queue{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty(){
            return s1.isEmpty();
        }
        public void add(int data){
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }
        public int remove(){
            if(s1.isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return s1.pop();
        }
        public int peek(){
            if (s1.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue Q = new Queue();
        Q.add(10);
        Q.add(20);
        Q.add(30);
        while (!Q.isEmpty()) {
            System.out.println(Q.peek());
            Q.remove();
        }
    }
}
