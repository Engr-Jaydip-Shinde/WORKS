public class reverseArray {
    public static void main(String[] args) {
        int arr[]={2,4,3,5,7,8,8};
        //Myself
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        //Class --TC=O(n), SC=1
        int start = 0, last=arr.length-1;
        while(start<last){
            int temp = arr[last];
            arr[last]=arr[start];
            arr[start]=temp;
            start++;
            last--;
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
