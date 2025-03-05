public class linearSearch {
    public static int Lsearch(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={2,5,4,7,2,6,3};
        int key = 7;
        Lsearch(arr,key);
        if(Lsearch(arr, key)==0){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("FOUND at : "+Lsearch(arr, key)+" index");
        }
    }
}
