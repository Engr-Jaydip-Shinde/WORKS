import java.util.*;
public class HMbasic{
    public static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<>();
        System.out.println("Hello World");
        map.put("China", 900);
        map.put("Pak", 100);
        map.put("Urop", 100);
        map.put("India", 500);
        // map.remove("India");
        // Checking
        System.out.println(map.remove("India"));
        System.out.println(map.get("Japan"));

        System.out.println(map.containsKey("India"));
        System.out.println(map.get("Pak"));
        map.clear();
        System.out.println(map.isEmpty());
    }
}