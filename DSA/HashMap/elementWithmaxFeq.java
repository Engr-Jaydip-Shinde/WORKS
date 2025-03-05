import java.util.*;
public class elementWithmaxFeq {
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,5,2,5,1,1,1};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }else{
                hm.put(arr[i], 1);
            }
        }
        
        Set<Integer> keys = hm.keySet();
        for (Integer i : keys){
            if(hm.get(i)>arr.length/3){
                System.out.print(i+" ");
            }
        }

    }
}
