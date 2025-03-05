public class maxSubArrSum3 {
    //Kadans Algorithm --> TC : O(n)
    //For all negative check all are negative or not and then
    //find the largest negative from this and then print the 
    //that number
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int CS=0 , MS=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            CS = CS+arr[i];
            if(CS<0){
                CS=0;
            }
            MS=Math.max(MS, CS);
        }
        System.out.println("MAX SUM IS: "+MS);
    }
}
