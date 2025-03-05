public class buyAndSell {
    public static void main(String[] args) {//TC  : O(n)
        int arr[]={7,6,4,3,1};
        int buyPrice = Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0; i<arr.length;i++){
            if(buyPrice<arr[i]){
                int profit = arr[i]-buyPrice;
                maxprofit=Math.max(maxprofit, profit);
            }else{
                buyPrice=arr[i];
            }
        }
        System.out.println(maxprofit);
    }
}
