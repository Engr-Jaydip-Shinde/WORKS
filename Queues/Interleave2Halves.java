import java.util.*;
public class Interleave2Halves {
    public static void Interleave(Queue<Integer> Q){
        Queue<Integer> firstHalve = new LinkedList<>();
        int size = Q.size();
        for(int i=0;i<size/2;i++){
            firstHalve.add(Q.remove());
        }
        while (!firstHalve.isEmpty()) {
            Q.add(firstHalve.remove());
            Q.add(Q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> Q = new LinkedList<>();
        Queue<Integer> Q1 = new LinkedList<>();
        Queue<Integer> Q2 = new LinkedList<>();
        Queue<Integer> Q3 = new LinkedList<>();
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        Q.add(5);
        Q.add(6);
        Q.add(7);
        Q.add(8);
        Q.add(9);
        Q.add(10);
        Q3.add(1);
        Q3.add(2);
        Q3.add(3);
        Q3.add(4);
        Q3.add(5);
        Q3.add(6);
        Q3.add(7);
        Q3.add(8);
        Q3.add(9);
        Q3.add(10);
        int size=Q.size();
        for(int i=0; i<size/2; i++){
            Q1.add(Q.remove());
        }
        System.out.println();

        for(int i=0; i<size/2; i++){
            Q2.add(Q.remove());
        }
        System.out.println();
        System.out.println("SIZE IS " + Q.size());
        System.out.println("SIZE IS " + Q1.size());
        System.out.println("SIZE IS " + Q2.size());
        while(!Q1.isEmpty() && !Q2.isEmpty()){
            Q.add(Q1.remove());
            Q.add(Q2.remove());
        }
        while (!Q.isEmpty()) {
            System.out.print(Q.remove()+" ");
        }

        System.out.println("Function wala code class");

        Interleave(Q3);
        while (!Q3.isEmpty()) {
            System.out.print(Q3.remove()+" ");
        }
    }
}
