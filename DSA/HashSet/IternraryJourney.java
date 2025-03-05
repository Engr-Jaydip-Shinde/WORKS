import java.util.*;
public class IternraryJourney {
    public static String getStart(HashMap<String,String> tickets){
        HashMap<String,String> revMap = new HashMap<>();
        for(String key : tickets.keySet()){
            revMap.put(tickets.get(key), key);
        }
        for(String key : tickets.keySet()){
            if (!revMap.containsKey(key)){
                return key;
            }
        }
        
        return null;
    }
    public static void main(String []args){
        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bangaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");
        //T.C. --> O(n)
        String start = getStart(tickets);
        System.out.print(start);
        for(String str : tickets.keySet()){
            System.out.println("-->" + tickets.get(start));
            start=tickets.get(start);
        }
        System.out.println();
    }
}
