public class S1 {
    public static void bubleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            boolean swapped = false;
            for(int j=0; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,4,3};
        bubleSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
    }   
}
