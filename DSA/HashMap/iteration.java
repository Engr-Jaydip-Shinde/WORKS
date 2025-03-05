import java.util.*;
public class iteration {
    public static void main(String[] args) {
    HashMap<String,Integer> Map = new HashMap<>();
    Map.put("China", 900);
    Map.put("Pak", 100);
    Map.put("Urop", 100);
    Map.put("India", 500);
    Set<String> keys = Map.keySet();
    Set keys2 = Map.entrySet();
    for (String i : keys){
        System.out.println("Key  : "+i+", Value : "+Map.get(i));
    }
    for (Object j : keys2) {
        System.out.println(j);
    }

    }
}
