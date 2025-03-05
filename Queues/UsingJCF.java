import java.util.*;
public class UsingJCF{
    public static void main(String[] args) {
        Queue<Integer> Q1 = new LinkedList<>();
        Queue<Integer> Q2 = new ArrayDeque<>();
        
        Q1.add(10);
        Q1.add(20);
        Q1.add(30);
        System.out.println(Q1.size());
        while (!Q1.isEmpty()){
            System.out.println(Q1.peek());
            Q1.remove();
        }
    }
}
