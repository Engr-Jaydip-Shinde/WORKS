public class hollowRectangle {
    public static void hollow_rectangle(int totalRow, int totalCol){
        //outer loop
        for(int i=1;i<=totalRow;i++){
            //iiner loop
            for(int j=1; j<=totalCol; j++){
                //cell - {i,j}
                if(i==1 || i==totalRow || j==1 || j==totalCol){
                    //boundary cells
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
     public static void main(String[] args) {
        int tr = 5 , tc = 9;
        hollow_rectangle(tr, tc);
     }
}
