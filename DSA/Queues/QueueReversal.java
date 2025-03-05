import java.util.*;
public class QueueReversal {
    public static void reversedQueue(Queue<Integer> Q){
        Stack<Integer> s = new Stack<>();
        while (!Q.isEmpty()) {
            s.push(Q.remove());
        }
        while (!s.isEmpty()) {
            Q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> Q = new LinkedList<>();
        Q.add(10);
        Q.add(20);
        Q.add(30);
        Q.add(40);
        Q.add(50);
        reversedQueue(Q);
        while (!Q.isEmpty()) {
            System.out.print(Q.remove()+" ");
        }
    }
}
