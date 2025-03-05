import java.util.*;
public class ObjectInPq {
    static class Students implements Comparable<Students>{
        String name;
        int rank;
        public Students(String name, int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Students s2){
            return this.rank-s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Students> pq = new PriorityQueue<>();
        pq.add(new Students("Jaydip",1));
        pq.add(new Students("Kuldip",17));
        pq.add(new Students("Vijaydip",14));
        pq.add(new Students("Harshit",9));
        pq.add(new Students("Kundan",12));
        
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name+" : "+pq.peek().rank);
            pq.remove();
        }
    }
}
