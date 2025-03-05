import java.util.*;
public class DoublyEndedQueue {
    public static void main(String[] args) {
        Deque<Integer> DQ = new LinkedList<>();
        DQ.add(1);
        DQ.add(2);
        DQ.addFirst(3);
        DQ.addLast(3);
        DQ.add(10);
        DQ.add(20);
        DQ.addFirst(4);
        DQ.addLast(5);
        
        System.out.println("remove first "+DQ.removeFirst());
        System.out.println("remove last "+DQ.removeLast());
        System.out.println("get first "+DQ.getFirst());
        System.out.println("get last "+DQ.getLast());
        System.out.println("size "+DQ.size());
        while (!DQ.isEmpty()) {
            System.out.println(DQ.remove());
        }

    }
}
