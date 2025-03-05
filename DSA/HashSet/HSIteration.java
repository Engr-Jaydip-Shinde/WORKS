import java.util.HashSet;
import java.util.Iterator;
public class HSIteration {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<String> cars = new HashSet<>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("G-Wagon");
        cars.add("RR");
        cars.add("TATA");
        set.add(10);
        set.add(12);
        set.add(14);
        Iterator<Integer> i = set.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        for(String j : cars){
            System.out.print( j +" -> ");
        }
    }
    

}
