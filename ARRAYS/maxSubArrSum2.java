public class maxSubArrSum2 {
    //prefix sum --> O(n^2)
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        int prefixArr[]=new int[arr.length],sum=0;
        int maxSum=Integer.MIN_VALUE;
        prefixArr[0]=arr[0];
        for(int i=1;i<prefixArr.length;i++){
            prefixArr[i]=prefixArr[i-1]+arr[i];
        }
        for(int m=0;m<arr.length;m++){//m=start , m=end
            for(int n=0;n<arr.length;n++){
                sum = m==0 ? sum=prefixArr[n] : prefixArr[n]-prefixArr[m-1];
            }
            if(maxSum<sum){
                maxSum=sum;
            }
        }
        System.out.println("Max sum is : "+maxSum);
        for(int k=0;k<prefixArr.length;k++){
            System.out.print(prefixArr[k]+" ");
        }
    }
}
