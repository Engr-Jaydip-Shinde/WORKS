public class maxSubArrSum {
    //Brutforce approach --> TC : O(n^3)
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        int maxSum=Integer.MIN_VALUE;
        int tp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum=sum+arr[k];
                }
                tp++;
                if(sum>maxSum){
                    maxSum=sum;
                }
                System.out.print(" --> "+sum+"\n");
            }
            System.out.println();
        }
        System.out.println("Total sub arrays: "+tp);
        System.out.println("Maximum Sub Array Sum is: "+maxSum);
    }
}
