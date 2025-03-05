import java.util.*;
public class S5 {
    public static void main(String[] args) {
        int arr[] = {2,4,3,1,5,6,};
        Integer arr2[]={2,4,3,1,5,2,7};
        Arrays.sort(arr);
        Arrays.sort(arr2,Collections.reverseOrder());
        for(int i=0; i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
