public class binaryToDecimal {
    public static void BtoD(int a){
        int dec = 0;
        int k=0;
        while (a!=0) {
            int ld=a%10;
            a=a/10;
            dec=dec+(ld*(int)Math.pow(2,k));
            k++;
        }
        System.out.println(dec);
    }
    public static void main(String args[]){
        int a = 1010;
        BtoD(a);
    }
}
