public class pairsInArray {
    public static void main(String[] args) {
        int arr[]={3,4,6,5,4};
        int tp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs"+tp);
    }
}
