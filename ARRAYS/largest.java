public class largest {
    public static void main(String[] args) {
        int arr[]={45,34,76,46,45,76,34,76,84};
        int largest = Integer.MIN_VALUE;
        int smalles = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smalles){
                smalles=arr[i];
            }
        }
        System.out.println(smalles);
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("LARGEST : "+largest);
    }
}
