public class binarySearch {
    public static int Bsearch(int arr[], int key){
        int si=0, ed=arr.length-1;
        while(si<=ed){
            int mid=(si+ed)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                si=mid+1;
            }else{
                ed=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,5,7,9,11,24,67,879};
        int key = 8;
        System.out.println("Index of key is: "+Bsearch(arr, key));
    }
}
