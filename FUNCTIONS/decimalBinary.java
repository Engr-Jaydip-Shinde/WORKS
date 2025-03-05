public class decimalBinary {
    public static void DetoB(int a){
        int binary=0,pow=0;
        while(a>0){
            int rem = a%2;
            binary = binary + rem*(int)Math.pow(10,pow);
            pow++;
            a=a/2;
        }
        System.out.println(binary);
    }
    public static void main(String[] args) {
        int b = 100;
        DetoB(b);
    }
    
}
