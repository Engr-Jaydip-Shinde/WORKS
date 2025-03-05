public class sumOfSecondRow2D {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},
                    {4,5,6},
                    {7,8,9},
                    };
        int sum=0;                 
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[1][i];
        }
        System.out.println(sum);
    }
}
