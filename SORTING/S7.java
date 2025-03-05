public class S7 {
    public static void quickSort(int arr[],int si, int ei){
        if (si>=ei) {
            return;
        }

        //last elelment

        int pivotIdx=partition(arr,si,ei);
        quickSort(arr, si, pivotIdx-1);//left
        quickSort(arr, pivotIdx+1, ei);
    }
    public static int partition(int arr[],int si, int ei){
        int pivot=arr[ei];
        int i=si-1;//to make place for els smaller then picot
        for(int j=si;j<ei;j++){
            if (arr[j]<=pivot) {
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
                //swap
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[]={3,6,3,7,4,8,9,4,8};
        quickSort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+" ");
        }
    }
}
