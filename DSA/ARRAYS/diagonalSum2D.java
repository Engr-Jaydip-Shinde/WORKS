public class diagonalSum2D {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},
                    {4,5,6},
                    {7,8,9},
                    };
        int ldSum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //Brut Force
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j){
                    ldSum+=arr[i][j];
                }else if(i+j==arr.length-1 ){
                    ldSum+=arr[i][j];
                }else{
                    continue;
                }
            }
            System.out.println();
        }
        System.out.println(ldSum);
        
        //Optimized
        int sum = 0;
        for(int i=0; i<arr.length;i++){
            //primary Diagoal
            sum=sum+arr[i][i];
            //secondary Diagonal
            if (i != arr.length-1-i) {
                sum = sum+arr[i][arr.length-i-1];
            }
        }
        System.out.println(sum);
    }
}
