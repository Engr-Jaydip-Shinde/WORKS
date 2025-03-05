public class searchInSorted2D {
    public static boolean stairCase(int arr[][], int key){
        int row=0, col=arr.length-1;
        while (row < arr.length && col >=0) {
            if(arr[row][col]==key){
                System.out.println("Found at ("+row+","+col+")");
                return true;
            }else if(key < arr[row][col]){
                col--;
            }else{
                row++;
            }
            
        }
        System.out.println("Not Found");
        return false;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},
                    {4,5,6},
                    {7,8,9},
                    };
        int key = 80;
        stairCase(arr, key);
    }
}
