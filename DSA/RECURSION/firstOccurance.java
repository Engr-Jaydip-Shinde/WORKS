package RECURSION;

public class firstOccurance {
    static int first(int arr[],int i, int key){
        if(arr[i]==key){
            return i;
        }
        if(i==arr.length-1){
            return -1;
        }
        return first(arr, i+1,key);
    }
    public static void main(String[] args) {
        int arr[] = {2,5,4,6,2,7};
        int key = 40;
        System.out.println(first(arr,0,key));
        
    }
}
