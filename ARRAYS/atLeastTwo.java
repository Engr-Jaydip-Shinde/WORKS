public class atLeastTwo {
    public static void main(String args[]){
        int arr[]={2,4,3,5,9,2,8,7,2,7,8,7,2};
        int key = 2, count=0; 
        for(int i=0; i<arr.length;i++){
            if(arr[i]==key){
                count++;
            }
        }
        if(count>=2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
