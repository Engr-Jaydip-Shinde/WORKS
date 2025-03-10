public class S3 {
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            //finding correct position
            while (prev>=0 && arr[prev]>curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,1,5,3};
        insertionSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
