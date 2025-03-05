public class floydsTri {
    public static void main(String[] args) {
        int n = 5,z=1;
        //rows
        for(int i=1;i<=n;i++){
            //columns
            for(int j=1;j<=i;j++){
                System.out.print(z+" ");
                z++;
            }
            System.out.println();
        }
    }
}
