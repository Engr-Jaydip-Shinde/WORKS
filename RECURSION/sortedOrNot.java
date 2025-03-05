package RECURSION;

public class sortedOrNot {
    static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,65,7,9,11,14,17,22,};
        System.out.println(isSorted(arr,0));
    }
}
