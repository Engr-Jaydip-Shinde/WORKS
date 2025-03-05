import java.util.*;
public class UnionAndIntersection2Arr {
    public static void main(String[] args) {
        int arr1[] = {1,5,2,3,9,1};
        int arr2[] = {3,1,2,4};
        HashSet<Integer> union = new HashSet<>();
        HashSet<Integer> Intersection = new HashSet<>();
        for(int i=0; i<arr1.length;i++){
            union.add(arr1[i]);
        }
        for(int j=0; j<arr2.length;j++){
            union.add(arr2[j]);
        }
        for(int i=0;i<arr1.length;i++){
            Intersection.add(arr1[i]);
        }
        int count=0;
        System.out.print("Intersection: ");
        for(int j=0;j<arr2.length;j++){
            if(Intersection.contains(arr2[j])){
                count++;
                System.out.print(arr2[j]+" ");
                Intersection.remove(arr2[j]);
            }
        }
        System.out.println("\nIntersection Element count: "+count);
        System.out.print("Union: "+union);
        System.out.print("\nUnion Element count: "+union.size());
        
        
    }
}
