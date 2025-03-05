public class invertedHalfNumber {
    public static void main(String[] args) {
        int n = 5;
        //rows
        for(int i=1;i<=n;i++){
            //columns
            for(int j=1;j<=(n+1)-i;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}
