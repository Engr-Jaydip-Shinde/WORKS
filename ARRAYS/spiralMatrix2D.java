public class spiralMatrix2D {
    public static void printspiral(int arr[][]) {
        int startROw =0;
        int startCol =0;
        int endROw = arr.length-1;
        int endCol = arr[0].length-1;
        while (startROw<=endROw && startCol<=endCol) {
            //top Boundary
            for(int j=startCol;j<=endCol;j++){
                System.out.print(arr[startROw][j]+" ");
            }

            //right Boundary
            for(int i=startROw+1;i<=endROw;i++){
                System.out.print(arr[i][endCol]+" ");
            }

            //bottom Boundary
            for(int j=endCol-1;j>=startCol;j--){
                if(startROw==endROw){
                    break;
                }
                System.out.print(arr[endROw][j]+" ");
            }

            //left
            for(int i=endROw-1; i>=startROw; i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(arr[i][startCol]+" ");
            }

            startCol++;
            startCol++;
            endCol--;
            endROw--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},
                    {4,5,6},
                    {7,8,9},
                    };
            printspiral(arr);
    }
}
