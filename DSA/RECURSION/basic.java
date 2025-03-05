package RECURSION;

public class basic {
    static int printNto1(int n){
        System.out.println(n);
        if(n==1){
            return 1;
        }
       return printNto1(n-1);

    }
    
    static void secPrint1toN(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        } 
        secPrint1toN(n-1);
        System.out.print(n+" ");
       
    }

         public static void main(String[] args) {
            secPrint1toN(10);
         }
}
