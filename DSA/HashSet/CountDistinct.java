import java.util.*;
public class CountDistinct {
    public static void main(String[] args) {
        int arr[] = {1,3,5,1,9,6,7,8,8,4,3};
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i<arr.length; i++){ // T.C. --> O(n)
            set.add(arr[i]);
        }
        
        System.out.println(set.size());
    }
}
